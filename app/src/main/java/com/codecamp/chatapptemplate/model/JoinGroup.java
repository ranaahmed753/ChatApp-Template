package com.codecamp.chatapptemplate.model;

public class JoinGroup {
    private int groupImage;
    private String groupName;

    public JoinGroup(int groupImage, String groupName) {
        this.groupImage = groupImage;
        this.groupName = groupName;
    }

    public int getGroupImage() {
        return groupImage;
    }

    public void setGroupImage(int groupImage) {
        this.groupImage = groupImage;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
