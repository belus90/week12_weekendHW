import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String depAirport;
    private String depTime;

    private ArrayList<Passenger> passenger;
    private PlaneType plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;

    public Flight(String flightNumber, String destination, String depAirport, String depTime, PlaneType plane, Pilot pilot) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
        this.plane = plane;
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passenger = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
}
