package main;

import model.CommonRoom;
import model.Hospital;
import model.Room;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        ArrayList<Room> hospitalRooms = new ArrayList<Room>();
        hospitalRooms.add(new CommonRoom());
        Hospital hospital = new Hospital("Comunnity Hospital","Los Angeles","South Street 123");

    }
}
