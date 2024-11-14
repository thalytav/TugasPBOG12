// EconomyTicket.java
class EconomyTicket extends Tiket {
    public EconomyTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }
    
    @Override
    public double calculateFare() {
        return baseFare * 0.9; // Diskon 10%
    }
    
    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        System.out.println("Class: Economy");
        System.out.println("Additional Services: Standard baggage allowance, No meal service.");
    }
}
