package Pojos;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ReturningCards {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("deck_id")
    @Expose
    private String deckId;
    @SerializedName("remaining")
    @Expose
    private Integer remaining;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

}

