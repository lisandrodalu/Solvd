package com.solvd.model;

public class Ambulance {
    private String model = "Toyota V6";
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Paramedic getParamedic() {
        return paramedic;
    }

    public void setParamedic(Paramedic paramedic) {
        this.paramedic = paramedic;
    }

    public AmbulanceDriver getAmbulanceDriver() {
        return ambulanceDriver;
    }

    public void setAmbulanceDriver(AmbulanceDriver ambulanceDriver) {
        this.ambulanceDriver = ambulanceDriver;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
