package main;

import exceptions.FullRoomException;
import exceptions.NonExistantDoctorException;
import exceptions.NonExistantRoomException;
import exceptions.OccupiedAmbulanceException;
import model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws OccupiedAmbulanceException { // this is wrong

        CommonRoom commonRoom = new CommonRoom(500,1,5);
        Doctor doctor1 = new Doctor("Martin White","2321",42,"Surgery",121,4600);
        Hospital hospital = new Hospital("Comunnity Hospital","Los Angeles","South Street 123");
        hospital.addRoom(commonRoom);
        hospital.addDoctor(doctor1);
        Patient patient = new Patient("Paul Jones","1234",22,"Swiss Medical");
        try {
            hospital.enterHospital(patient);
        } catch (FullRoomException e) {
          LOGGER.info(e.getMessage());
        }
        try {
            hospital.attendPatient(patient,121);
        } catch (NonExistantDoctorException e) {
          LOGGER.info(e.getMessage());
        }
        try {
            hospital.assignRoom(2,patient);
        } catch (NonExistantRoomException e) {
            LOGGER.error(e);
        } catch (FullRoomException e) {
            LOGGER.info(e.getMessage());
        }

        hospital.ambulanceTrip(new Paramedic(),new AmbulanceDriver());
    }
}