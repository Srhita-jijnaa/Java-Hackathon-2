import java.util.Scanner;
public class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }
    double calculateDiscount() {
        return numberOfTickets >= 5 ? calculateTotal() * 0.10 : 0;
    }
    void displayBill() {
        double total = calculateTotal();
        double discount = calculateDiscount();
        System.out.println("\n--- Cinema Ticket Bill ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (total - discount));
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String name = obj.nextLine();
        System.out.print("Enter ticket price: ");
        double price = obj.nextDouble();
        System.out.print("Enter number of tickets: ");
        int tickets = obj.nextInt();
        MovieTicket m = new MovieTicket(name, price, tickets);
        m.displayBill();
    }
}