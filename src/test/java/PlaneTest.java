import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() { plane = new Plane(PlaneEnum.JUMBO_JET); }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneEnum.JUMBO_JET, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(500, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(200000, plane.getPlaneWeight());
    }
}
