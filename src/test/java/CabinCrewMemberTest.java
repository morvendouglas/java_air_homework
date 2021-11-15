import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){ cabinCrewMember = new CabinCrewMember("Betty Green", StaffEnum.FLIGHT_ATTENDANT); }

    @Test
    public void canGetName(){
        assertEquals("Betty Green", cabinCrewMember.getName());
    }

    @Test
    public void canGetRanking(){
        assertEquals(StaffEnum.FLIGHT_ATTENDANT, cabinCrewMember.getRanking());
    }

    @Test
    public void canGiveMessageToPassengers(){
        assertEquals("Please fasten your seatbelts for take-off.", cabinCrewMember.giveMessageToPassengers());
    }
}
