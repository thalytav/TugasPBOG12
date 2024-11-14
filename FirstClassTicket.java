// FirstClassTicket.java
class FirstClassTicket extends Tiket {
    public FirstClassTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }
    
    @Override
    public double calculateFare() {
        return baseFare * 1.5; // Tambah 50%
    }
    
    // Menampilkan detail khusus untuk kelas first class
    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        System.out.println("Class: First Class");
        System.out.println("Additional Services: VIP lounge access, Extra baggage allowance, Luxury meal and drink service.");
    }
}
