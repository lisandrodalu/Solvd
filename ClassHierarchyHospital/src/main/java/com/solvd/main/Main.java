package com.solvd.main;

import com.solvd.enums.Medicine;
import com.solvd.enums.Specialties;
import com.solvd.exceptions.*;
import com.solvd.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws OccupiedAmbulanceException { // this is wrong

        //Declaration
        CommonRoom commonRoom = new CommonRoom(500,1,5);
        PrivateRoom privateRoom = new PrivateRoom(600,2);
        Doctor doctor1 = null;
        try {
            doctor1 = new Doctor("Martin White","2321",42,Specialties.SURGERY.toString(),121,4600);
        } catch (InvalidAgeException e) {
            LOGGER.info(e.getMessage());
        }
        Hospital hospital = new Hospital("Comunnity Hospital","Los Angeles","South Street 123");
        hospital.addRoom(commonRoom);
        hospital.addRoom(privateRoom);
        hospital.addDoctor(doctor1);
        Patient patient = null;
        try {
            patient = new Patient("Paul Jones","1234",22,"Swiss Medical");
        } catch (InvalidAgeException e) {
           LOGGER.info(e.getMessage());
        }

        //Methods with exceptions
        try {
            hospital.enterHospital(patient);
        } catch (FullRoomException e) {
          LOGGER.info(e.getMessage());
        }
        try {
            hospital.attendPatient(patient,121);
        }catch (NonExistantDoctorException e) {
          LOGGER.info(e.getMessage());
        }
        try {
            hospital.assignRoom(2,patient);
        } catch (NonExistantRoomException e) {
            LOGGER.error(e);
        } catch (FullRoomException e) {
            LOGGER.info(e.getMessage());
        }

        Paramedic paramedic = new Paramedic();
        AmbulanceDriver driver = new AmbulanceDriver();
        hospital.ambulanceTrip(paramedic,driver);

        //Functional Interfaces
        doctor1.work(()-> System.out.println("Doctor Working"));
        paramedic.work(()-> System.out.println("Paramedic Working"));
        driver.work(()-> System.out.println("Ambulance Driver Working"));




    }

}
