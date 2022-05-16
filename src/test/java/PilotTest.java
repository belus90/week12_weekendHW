import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Vivke", CabinCrewMember.CAPTAIN, "EH4536M90");
    }

    @Test
    public void hasName(){
        assertEquals("Vivke", pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(CabinCrewMember.CAPTAIN, pilot.getRank());
    }
    @Test
    public void hasLicenseNumber(){
        assertEquals("EH4536M90", pilot.getLicenceNumber());
    }
    @Test
    public void changeName(){
        pilot.setName("Mate");
        assertEquals("Mate", pilot.getName());
    }
    @Test
    public void changeLicNum(){
        pilot.setLicenceNumber("WB3425LK");
        assertEquals("WB3425LK", pilot.getLicenceNumber());
    }
}
