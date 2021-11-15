import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){ pilot = new Pilot("Roger Campbell", StaffEnum.CAPTAIN, "FLY1234"); }

    @Test
    public void canGetName(){
        assertEquals("Roger Campbell", pilot.getName());
    }

    @Test
    public void canGetRanking(){
        assertEquals(StaffEnum.CAPTAIN, pilot.getRanking());
    }

    @Test
    public void canGetLicenceNo(){
        assertEquals("FLY1234", pilot.getLicenceNo());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Flight in progress.", pilot.flyPlane());
    }

}
