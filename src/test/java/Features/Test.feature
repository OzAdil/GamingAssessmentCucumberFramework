Feature:Remaining


  Scenario: Remaining cards correctly updated after drawing

Given  Assuming a new deck starts with 52 cards:
And Draw cards from the deck 5 times each time draw between 1 and 5 cards at random
And Return the first drawn card back to the deck
Then Verify that the correct number of cards are remaining number plus 5 in the deck