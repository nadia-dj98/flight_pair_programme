import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        // welcome message system out
        //Options 1 -5
        // want input from user
        //depending on option chosen perform the method
        //
        Airline airline = new Airline("BNTA Jets");
        boolean running = true;

        System.out.println("Welcome to BNTA Airline. Please choose one of the following options:");
        while (running == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("To add a new flight: Enter 1");
            System.out.println("To display all available flights: Enter 2");
            System.out.println("To add a new passenger: Enter 3");
            System.out.println("To book a passenger onto a flight: Enter 4");
            System.out.println("To cancel a flight: Enter 5");
            System.out.println("Finish enquiry: Enter 6");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Scanner destinationScanner = new Scanner(System.in);
                System.out.println("Enter your desired destination: ");
                String destination = destinationScanner.nextLine();

                Scanner flightIdScanner = new Scanner(System.in);
                System.out.println("Enter the flight id: ");
                int flightId = flightIdScanner.nextInt();
                Flight flight = new Flight(destination, flightId);
                airline.addNewFlight(flight);
                System.out.println("You've successfully added a flight to " + destination + " with id " + flightId);
            }

            if (choice == 2) {
                System.out.println("Here are your available flights: ");
                airline.displayAllFlights();
                if(airline.countNumberOfFlights() == 0) {
                    System.out.println("There are currently no available flights.");
                }
            }

            if (choice == 3) {
                Scanner passengerName = new Scanner(System.in);
                System.out.println("Please enter the passenger's name: ");
                String name = passengerName.nextLine();

                Scanner passengerEmail = new Scanner(System.in);
                System.out.println("Please enter the passenger's email address: ");
                String email = passengerEmail.nextLine();

                Scanner passengerId = new Scanner(System.in);
                System.out.println("Please enter the passenger's id: ");
                int uniqueId = passengerId.nextInt();

                Passenger passenger = new Passenger(name, email, uniqueId);
                airline.addPassengerOntoSystem(passenger);

                System.out.println("You've successfully added " + name + " to the system.");

            }



            if (choice == 6) {
                running = false;
            }


        }


    }
}
