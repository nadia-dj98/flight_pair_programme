import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AirlineTest {


    private Airline airline;

    @BeforeEach
    public void setUp() {
        this.airline = new Airline("Easy Jet");
    }

    @Test
    public void test_canAddNewFlightsToArrayList() {
        Flight flightToSpain = new Flight("Mallorca", 234);
        Flight flightToPortugal = new Flight("Lisbon", 333);
        airline.addNewFlight(flightToSpain);
        airline.addNewFlight(flightToPortugal);
        int expected = 2;
        int actual = airline.countNumberOfFlights();
        assertEquals(actual, expected);

    }






}
