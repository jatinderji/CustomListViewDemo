package com.jatin.customlistviewdemo;

public class MyRow {
    private String name;
    private String contact;
    private int imageId;

    public MyRow(String name, String contact, int imageId) {
        this.name = name;
        this.contact = contact;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
