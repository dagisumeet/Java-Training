package Java.Training.Practice.Day22;

public class AgeRestrictionException extends RuntimeException {

    private String message;

    public AgeRestrictionException(String message) {
        super(message);
    }
}
