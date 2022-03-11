public class Ambulance {
    private String model;
    private Paramedic paramedic;
    private AmbulanceDriver ambulanceDriver;
    private boolean free = true;

    public Ambulance() {
    }

    public Ambulance(String model, Paramedic paramedic, AmbulanceDriver ambulanceDriver) {
        this.model = model;
        this.paramedic = paramedic;
        this.ambulanceDriver = ambulanceDriver;
    }
}
