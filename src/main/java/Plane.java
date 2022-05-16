public class Plane {

    private PlaneType  type;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public PlaneType getType() {
        return type;
    }

    public int getCapacityFromEnum() {
        return this.type.getCapacity();
    }

    public int getWeightFromEnum() {
        return this.type.getTotalWeight();
    }
}
