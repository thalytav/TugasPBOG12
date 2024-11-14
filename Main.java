// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk setiap kelas tiket
        Tiket economy = new EconomyTicket("Alice", 500);
        Tiket business = new BusinessTicket("Bob", 500);
        Tiket firstClass = new FirstClassTicket("Charlie", 500);
        
        // Menampilkan detail tiket untuk setiap jenis tiket
        System.out.println("Economy Class Ticket:");
        economy.printTicketDetails();
        
        System.out.println("\nBusiness Class Ticket:");
        business.printTicketDetails();
        
        System.out.println("\nFirst Class Ticket:");
        firstClass.printTicketDetails();
    }
}
