import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737_MAX);
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING737_MAX, plane.getType());
    }
    @Test
    public void hasCapacity(){
        assertEquals(204, plane.getCapacityFromEnum());
    }
    @Test
    public void hasWeight(){
        assertEquals(80, plane.getWeightFromEnum());
    }
}
