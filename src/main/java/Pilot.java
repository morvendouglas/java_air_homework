public class Pilot {

    private String name;
    private StaffEnum staffEnum;
    private String licenceNo;

    public Pilot(String name, StaffEnum staffEnum, String licenceNo){
        this.name = name;
        this.staffEnum = staffEnum;
        this.licenceNo = licenceNo;
    }

    public String getName() {
        return name;
    }

    public StaffEnum getRanking() {
        return staffEnum;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public String flyPlane(){
        return "Flight in progress.";
    }
}
