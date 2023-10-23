package Exceptions;

public class SpotNotAvailableException extends Exception {
    public SpotNotAvailableException(){
        super("No spots available for specified Spot type");
    }
}
