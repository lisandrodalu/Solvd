package exceptions;

public class NonExistantDoctorException extends Exception{
    public NonExistantDoctorException() {
    }

    public NonExistantDoctorException(String message) {
        super(message);
    }
}
