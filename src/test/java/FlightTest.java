import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot captain;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember purser;
    Plane plane;
    Flight flight;
    Passenger passenger;

    @Before
    public void before() {
        captain = new Pilot("Rose Dawson", StaffEnum.CAPTAIN, "FlY0987");
        cabinCrewMember1 = new CabinCrewMember("Jack Sparrow", StaffEnum.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Harley Quinn", StaffEnum.FLIGHT_ATTENDANT);
        purser = new CabinCrewMember("Brooke Davis", StaffEnum.PURSER);
        plane = new Plane(PlaneEnum.JUMBO_JET);
        flight = new Flight("BEO1234", "FRA", "GBR", "10:30");
        passenger = new Passenger("Harry Kane", 1);
    }

    @Test
    public void flightHasCaptain(){
        flight.setPilot(captain);
        assertEquals("Rose Dawson", flight.getPilot().getName());
    }

    @Test
    public void flightHasCabinCrew(){
        flight.addCabinCrew(cabinCrewMember1);
        flight.addCabinCrew(cabinCrewMember2);
        flight.addCabinCrew(purser);
        assertEquals(3, flight.cabinCrewCount());
    }

    @Test
    public void flightHasPlane(){
        flight.setPlane(plane);
        assertEquals(PlaneEnum.JUMBO_JET, flight.getPlane().getPlaneType());
    }

    @Test
    public void canGetNoOfSeatsOfPlane(){
        flight.setPlane(plane);
        assertEquals(500, flight.getPlane().getPlaneCapacity());
    }

    @Test
    public void canBookPassengerOnPlane(){
        flight.addPassenger(plane, passenger);
        assertEquals(1, flight.passengerCount());
    }

}
