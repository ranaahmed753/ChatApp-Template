package com.codecamp.chatapptemplate.model;

public class AddFriend {
    private int addFriendImage;
    private String addFriendName;

    public AddFriend(int addFriendImage, String addFriendName) {
        this.addFriendImage = addFriendImage;
        this.addFriendName = addFriendName;
    }

    public int getAddFriendImage() {
        return addFriendImage;
    }

    public void setAddFriendImage(int addFriendImage) {
        this.addFriendImage = addFriendImage;
    }

    public String getAddFriendName() {
        return addFriendName;
    }

    public void setAddFriendName(String addFriendName) {
        this.addFriendName = addFriendName;
    }
}
