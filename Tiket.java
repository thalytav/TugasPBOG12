// Tiket.java
public class Tiket {
    protected String passengerName;
    protected double baseFare;
    
    public Tiket(String passengerName, double baseFare) {
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }
    
    // Method untuk menghitung tarif, dioverride di subclass
    public double calculateFare() {
        return baseFare;
    }
    
    public String getPassengerName() {
        return passengerName;
    }
    
    // Method untuk menampilkan informasi umum
    public void printTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("Final Fare: $" + calculateFare());
    }
}
