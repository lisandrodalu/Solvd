package model;

import java.util.Iterator;
import java.util.TreeSet;

public class PatientsDataBase {
    private int num = 0;    // number to identify patientsbin the dataBase
    TreeSet<Patient> patients = new TreeSet<>(); // ordered by num

    public PatientsDataBase() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TreeSet<Patient> getPatients() {
        return patients;
    }

    public void setPatients(TreeSet<Patient> patients) {
        this.patients = patients;
    }

    public void addPatient(Patient p){
        this.num++;
        p.setPatientNumber(num);
        patients.add(p);
    }
    public boolean searchPatient(Patient patient){
        boolean exist = false;
        Iterator<Patient> it = this.patients.iterator();
        while(it.hasNext() && !exist){
            Patient actual = it.next();
            if(actual.getId() == patient.id)
                exist = true;
        }
        return exist;
    }
}
