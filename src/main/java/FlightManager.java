public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int getBaggageAllowanceForAPassenger() {
        int totalBaggageWeight = flight.getPlane().getPlaneWeight() / 2;
        int forEachPassenger = totalBaggageWeight / flight.getPlane().getPlaneCapacity();
        return forEachPassenger;
    }

    public int howMuchBaggageWeightIsLeft() {
        int passengerAllowance = getBaggageAllowanceForAPassenger();
        int allPassengersBooked = passengerAllowance * flight.passengerCount();
        int totalBaggageWeight = flight.getPlane().getPlaneWeight() / 2;
        int weightLeft = totalBaggageWeight - allPassengersBooked;
        return weightLeft;
    }

}
