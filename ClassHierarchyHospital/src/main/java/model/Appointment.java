package model;


public class Appointment {
    private Doctor doctor;
    private final double price = 300;

    public Appointment(Doctor doctor) {
        this.doctor= doctor;

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


}
