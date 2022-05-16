import org.junit.Before;

public class FlightTest {

    private Flight flight;

    @Before
    public void before(){
        flight = new Flight("BR4356","EDI","BP","12:00",PlaneType.BOEING747,new Pilot("Kevin",CabinCrewMember.CAPTAIN,"WE45612"));
    }
}
