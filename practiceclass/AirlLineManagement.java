import java.util.Scanner;
public class AirlLineManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to AirLine Management System!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of flights: ");
        int numFlights = scanner.nextInt();
        String[] flightNumbers = new String[numFlights];    
        for (int i = 0; i < numFlights; i++) {
            System.out.print("Enter flight number " + (i + 1) + ": ");
            flightNumbers[i] = scanner.next();
        }
    }
    
    
}
