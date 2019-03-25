package com.builov.recyclerviewlesson;

public class User_Info {

    private String firstname;
    private String lastname;
    private int age;
    private int image;

    public User_Info(String firstname, String lastname, int age, int image) {

        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.image=image;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


