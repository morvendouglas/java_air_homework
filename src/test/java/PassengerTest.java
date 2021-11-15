import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){ passenger = new Passenger("Lara Edwards", 1); }

    @Test
    public void passengerHasName(){
        assertEquals("Lara Edwards", passenger.getName());
    }

    @Test
    public void passengerHasNoOfBags(){
        assertEquals(1, passenger.getNoOfBags());
    }


}
