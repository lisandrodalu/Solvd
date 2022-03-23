package exceptions;

public class OccupiedAmbulanceException extends Exception{
    public OccupiedAmbulanceException() {
    }

    public OccupiedAmbulanceException(String message) {
        super(message);
    }
}
