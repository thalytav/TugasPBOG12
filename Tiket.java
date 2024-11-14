// Tiket.java
import java.util.Scanner;

public class Tiket {
    protected String passengerName;
    protected double baseFare;
    
    public Tiket(String passengerName, double baseFare) {
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }
    
    public double calculateFare() {
        return baseFare;
    }
    
    public String getPassengerName() {
        return passengerName;
    }
    
    public void printTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("Final Fare: $" + calculateFare());
    }
}
