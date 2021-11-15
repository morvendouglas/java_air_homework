public class CabinCrewMember {

    private String name;
    private StaffEnum staffEnum;

    public CabinCrewMember(String name, StaffEnum staffEnum){
        this.name = name;
        this.staffEnum = staffEnum;
    }

    public String getName() {
        return name;
    }

    public StaffEnum getRanking() {
        return staffEnum;
    }

    public String giveMessageToPassengers() {
        return "Please fasten your seatbelts for take-off.";
    }
}
