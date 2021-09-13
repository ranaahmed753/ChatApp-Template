package com.codecamp.chatapptemplate.model;

public class Chat {
    private int chatImage;
    private String chatName;
    private String chatMessage;

    public Chat(int chatImage, String chatName, String chatMessage) {
        this.chatImage = chatImage;
        this.chatName = chatName;
        this.chatMessage = chatMessage;
    }

    public int getChatImage() {
        return chatImage;
    }

    public void setChatImage(int chatImage) {
        this.chatImage = chatImage;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }
}
