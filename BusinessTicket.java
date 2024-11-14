// BusinessTicket.java
class BusinessTicket extends Tiket {
    public BusinessTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }
    
    @Override
    public double calculateFare() {
        return baseFare * 1.25; // Tambah 25%
    }
    
    // Menampilkan detail khusus untuk kelas bisnis
    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        System.out.println("Class: Business");
        System.out.println("Additional Services: Priority boarding, Increased baggage allowance, Complimentary meal.");
    }
}
