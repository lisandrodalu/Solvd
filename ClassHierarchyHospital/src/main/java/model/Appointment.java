package model;

import javax.print.Doc;

public class Appointment {
    private Doctor doctor;
    private double price = 300;

    public Appointment(Doctor doctor, double price) {
        this.doctor= doctor;
        this.price = price;
    }

    public Appointment() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
