package model;

import java.util.ArrayList;

public class Nurse extends Employee {
    private ArrayList<Medicine> medicine = new ArrayList<>();

    public Nurse() {

    }

    public Nurse(String name, String id, int age, long salary, ArrayList<Medicine> medicine) {
        super(name, id, age, salary);
        this.medicine = medicine;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }
    public void addMedicine(Medicine medicine){
        this.medicine.add(medicine);
    }
}
