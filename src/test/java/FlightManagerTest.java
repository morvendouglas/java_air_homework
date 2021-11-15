import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    FlightManager flightManager;
    Passenger passenger;



    @Before
    public void before(){
        passenger = new Passenger("Harry Kane", 1);
        flight = new Flight("BEO1234", "FRA", "GBR", "10.30");
        plane = new Plane(PlaneEnum.MIDSIZED_JET);
        flight.addPassenger(plane, passenger);
        flight.setPlane(plane);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canSetFlightToFlightManager(){
        assertEquals("BEO1234", flightManager.flight.getFlightNo());
    }

    @Test
    public void canGetBaggageAllowanceForEachPassenger(){
        assertEquals(50, flightManager.getBaggageAllowanceForAPassenger());
    }

    @Test
    public void canGetHowMuchBaggageWeightIsLeft(){
        assertEquals(450, flightManager.howMuchBaggageWeightIsLeft());
    }




}
