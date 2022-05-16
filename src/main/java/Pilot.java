public class Pilot {

    private String name;
    private CabinCrewMember rank;
    private String licenceNumber;

    public Pilot(String name, CabinCrewMember rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public CabinCrewMember getRank() {
        return rank;
    }

}
