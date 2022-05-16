public class Passenger {

    private String name;
    private int    numberOfBags;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
