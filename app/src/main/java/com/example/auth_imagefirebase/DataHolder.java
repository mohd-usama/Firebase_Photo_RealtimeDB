package com.example.auth_imagefirebase;

public class DataHolder
{
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    String name,contact,course, image;

    public DataHolder(String name, String contact, String course, String image) {
        this.name = name;
        this.contact = contact;
        this.course = course;
        this.image =    image;

    }
}
