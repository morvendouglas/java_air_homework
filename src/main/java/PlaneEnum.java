public enum PlaneEnum {

    LIGHT_JET(4, 500),
    MIDSIZED_JET(10, 1000),
    JUMBO_JET(500, 200000),
    AIRBUS(800, 500000);

    private final int capacity;
    private final int weight;

    PlaneEnum(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

}
