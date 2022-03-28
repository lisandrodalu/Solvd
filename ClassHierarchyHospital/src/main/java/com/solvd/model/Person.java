package com.solvd.model;

import com.solvd.exceptions.InvalidAgeException;

public class Person {
    protected String name;
    protected String id;
    protected int age;

    public Person() {

    }

    public Person(String name, String id, int age) throws InvalidAgeException {
        this.name = name;
        this.id = id;
        if(age>0)
        this.age = age;
        else
            throw new InvalidAgeException("The age must be positive");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
