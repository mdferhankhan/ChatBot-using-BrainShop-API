package com.example.chatbot;

public class ChatsModal {
    private String message;
    private String Sender;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public ChatsModal(String message, String sender) {
        this.message = message;
        Sender = sender;
    }
}
