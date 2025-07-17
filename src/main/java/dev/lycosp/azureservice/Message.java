package dev.lycosp.azureservice;

public class Message {
    private int rand;
    private String message;

    public Message(int rand, String message) {
        this.rand = rand;
        this.message = message;
    }

    public int getRand() {
        return rand;
    }

    public String getMessage() {
        return message;
    }
}
