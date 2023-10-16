import java.util.Scanner;

class StaticDemo {
    static String cinemaName;
    static int CostofTicket;
    static Scanner scanner =null;

    static {
        System.out.println("Enter the cinemaName");
        scanner = new Scanner(System.in); // Create a new Scanner object
        cinemaName = scanner.next();
    }

    public static void main(String[] s) {
        System.out.println("Main method");
        System.out.println("Cinema Name: " + cinemaName);
        System.out.println("Cost of the ticket: " + CostofTicket);
    }

    static {
        System.out.println("Enter the cost of the ticket");
        scanner = new Scanner(System.in); // Create another Scanner object
        CostofTicket = scanner.nextInt();
    }
}
