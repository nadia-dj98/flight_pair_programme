import java.util.ArrayList;

public class Airline {


    private String name;
    private ArrayList<Flight> allFlights;
    private ArrayList<Passenger> allPassengers;


    public Airline(String name) {
        this.name = name;
        this.allFlights = new ArrayList<>();
        this.allPassengers = new ArrayList<>();
    }
    //methods
    public void addNewFlight(Flight flight){
        this.allFlights.add(flight);
    }
    public void cancelFlight(Flight flight){
        this.allFlights.remove(flight);
    }
    public ArrayList<Flight> displayAllFlights(){
        return this.allFlights;
    }




//getters and setters
    public String getName(){
        return this.name;
    }
   public ArrayList<Passenger> getAllPassengers(){
        return this.allPassengers;
    }







}
