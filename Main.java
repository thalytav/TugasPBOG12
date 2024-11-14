// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nama penumpang dan base fare
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        
        System.out.print("Enter base fare: ");
        double baseFare = scanner.nextDouble();
        
        // Meminta input kelas tiket
        System.out.print("Enter ticket class (1 for Economy, 2 for Business, 3 for First Class): ");
        int ticketClass = scanner.nextInt();
        
        // Membuat objek tiket berdasarkan input kelas tiket
        Tiket ticket;
        switch(ticketClass) {
            case 1:
                ticket = new EconomyTicket(passengerName, baseFare);
                break;
            case 2:
                ticket = new BusinessTicket(passengerName, baseFare);
                break;
            case 3:
                ticket = new FirstClassTicket(passengerName, baseFare);
                break;
            default:
                System.out.println("Invalid class selection. Defaulting to Economy.");
                ticket = new EconomyTicket(passengerName, baseFare);
        }
        
        // Menampilkan detail tiket
        System.out.println("\nTicket Details:");
        ticket.printTicketDetails();
        
        scanner.close();
    }
}
