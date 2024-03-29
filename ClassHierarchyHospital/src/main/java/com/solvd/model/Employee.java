package com.solvd.model;

import com.solvd.exceptions.InvalidAgeException;
import com.solvd.interfaces.IWork;

public class Employee extends Person{
    protected long salary;

    public Employee(){

    }
    public Employee(String name, String id, int age, long salary) throws InvalidAgeException {
        super(name, id, age);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void work(IWork work){
        work.work();
    }
}
