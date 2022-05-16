public enum PlaneType {

    BOEING747(524,139),
    BOEING737_MAX(204,80),
    BOEING767(269,58),
    BOEING777X(426, 260);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
