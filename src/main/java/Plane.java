public class Plane {

    private PlaneEnum planeEnum;

    public Plane(PlaneEnum planeEnum){
        this.planeEnum = planeEnum;
    }

    public PlaneEnum getPlaneType() {
        return planeEnum;
    }

    public int getPlaneCapacity() {
        return planeEnum.getCapacity();
    }

    public int getPlaneWeight() {
        return planeEnum.getWeight();
    }

}
