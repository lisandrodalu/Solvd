package com.solvd.model;

import com.solvd.exceptions.InvalidAgeException;

public class Paramedic extends Employee {

    public Paramedic() {
    }

    public Paramedic(String name, String id, int age, long salary) throws InvalidAgeException {
        super(name, id, age, salary);
    }
}

