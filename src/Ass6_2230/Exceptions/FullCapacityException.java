package Ass6_2230.Exceptions;

public class FullCapacityException extends RuntimeException {
    public FullCapacityException(String collection) {
        System.out.println("Capacity of " + collection + " is at maximum");
    }
}
