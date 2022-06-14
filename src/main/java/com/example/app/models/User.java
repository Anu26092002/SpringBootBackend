package com.example.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class User {

    @Id
    private String id;

    @Field
    private String firstName;

    @Field
    private String lastName;

    @Field
    private int age;

    @Field
    private String degree;

    @Field
    private String city;

    @Field
    private String country;

    public User() {
    }

    public User(String firstName, String lastName, int age, String degree, String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
        this.city = city;
        this.country = country;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return String.format("User[id='%s',firstName='%s',lastName='%s',age='%d',degree='%s',city='%s',country='%s']",
                id, firstName, lastName, age, degree, city, country);
    }

}
