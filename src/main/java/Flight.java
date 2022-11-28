import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengersOnFlight;

    public Flight(String destination, int flightId){
        this.destination = destination;
        this.flightId = flightId;
        this.passengersOnFlight = new ArrayList<>();
    }


    //getters and setters

    public String getDestination(){
        return this.destination;
    }
    public int getFlightId(){
        return this.flightId;
    }
    public ArrayList<Passenger> getPassengers(){
        return this.passengersOnFlight;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }


}

