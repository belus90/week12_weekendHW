import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jojo", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Jojo", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void setName(){
        passenger.setName("Vivien");
        assertEquals("Vivien", passenger.getName());
    }
}
