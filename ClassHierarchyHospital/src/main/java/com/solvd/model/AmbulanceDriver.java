package com.solvd.model;

import com.solvd.exceptions.InvalidAgeException;

public class AmbulanceDriver extends Employee {

    public AmbulanceDriver() {
    }

    public AmbulanceDriver(String name, String id, int age, long salary) throws InvalidAgeException {
        super(name, id, age, salary);
    }
}
