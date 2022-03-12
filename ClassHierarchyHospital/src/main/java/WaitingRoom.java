import java.util.ArrayList;

public class WaitingRoom {
     private int capacity;
    ArrayList<Patient> patients = new ArrayList<>();
    public WaitingRoom() {
    }

    public WaitingRoom(int capacity, ArrayList<Patient> patients) {
        this.capacity = capacity;
        this.patients = patients;
    }

    public void enterPatient(Patient p){
        if(this.patients.size()<capacity)
        {
            this.capacity--;
            this.patients.add(p);
        }
    }
}
