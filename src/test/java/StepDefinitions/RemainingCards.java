package StepDefinitions;

import Utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.ThreadLocalRandom;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class RemainingCards {


    Response response;
    String deckId;
    List<String> listOfFirstDrawCard=new ArrayList<>();
    int beforeReturnRemainingCardNum;
    int afterReturnRemainingCardNum;

    @Given("Assuming a new deck starts with {int} cards:")
    public void assuming_a_new_deck_starts_with_cards(Integer int1) {
       response= given()
                        .when()
                        .get(ConfigurationReader.getProperty("new_deck"));



       //Assert status Code
        response.then().assertThat().statusCode(HttpStatus.SC_OK);

        //Assert remaining card
        response.then().body("remaining", equalTo(int1));

        //Convert response to String using JsonPath
       String jsonString = response.asString();
       deckId = JsonPath.from(jsonString).get("deck_id");

    }

    @Given("Draw cards from the deck {int} times each time draw between {int} and {int} cards at random")
    public void draw_cards_from_the_deck_times_each_time_draw_between_and_cards_at_random(Integer times, Integer min, Integer max) {

        for (int i = 1; i<=times; i++) {
            int randomNum= ThreadLocalRandom.current().nextInt(min,max);
            response = given()
                    .when()
                    .queryParam("count", randomNum)
                    .get(ConfigurationReader.getProperty("draw_card"), deckId);
            //Assert status Code
            response.then().assertThat().statusCode(HttpStatus.SC_OK);
            //Add first card code the list
            listOfFirstDrawCard.add(response.jsonPath().getString("cards[0].code"));
        }
        //Remaining card after draw
        beforeReturnRemainingCardNum = response.jsonPath().getInt("remaining");

    }

    @Given("Return the first drawn card back to the deck")
    public void return_the_first_drawn_card_back_to_the_deck() {

        //Remove brackets and space in list
        String str=listOfFirstDrawCard.
                toString().
                replace("[","").
                replace("]","").
                replaceAll(" ","");


        response = given()
                .when()
                .queryParam("cards", str)
                .get(ConfigurationReader.getProperty("return_firstDrawCard"), deckId);

        //Assert status Code
        response.then().assertThat().statusCode(HttpStatus.SC_OK);

        //Remaining card after returning first cards
        afterReturnRemainingCardNum = response.jsonPath().getInt("remaining");


    }

    @Then("Verify that the correct number of cards are remaining number plus {int} in the deck")
    public void verify_that_the_correct_number_of_cards_are_remaining_number_plus_in_the_deck(int addition) {

        assertEquals(afterReturnRemainingCardNum - beforeReturnRemainingCardNum, addition);

    }

}
