
import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departingFrom;
    private String departureTime;

    public Flight(String flightNo, String destination, String departingFrom, String departureTime){
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.departingFrom = departingFrom;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void addCabinCrew(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public int cabinCrewCount(){
        return cabinCrewMembers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public int passengerCount(){
        return passengers.size();
    }

    public boolean checkCapacity(Plane plane){
        if (plane.getPlaneCapacity() > passengerCount()){
            return true;
        }
        else {
            return false;
        }
    }

    public void addPassenger(Plane plane, Passenger passenger) {
        if (checkCapacity(plane) == true) {
            this.passengers.add(passenger);
        }
    }

    public String getFlightNo() {
        return flightNo;
    }

}
