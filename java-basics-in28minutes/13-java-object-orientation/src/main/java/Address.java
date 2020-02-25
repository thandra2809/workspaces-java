public class Address {
    private String doorNo;
    private String streetInfo;
    private String city;
    private String zipCode;

    public Address(String doorNo, String streetInfo, String city, String zipCode) {
        this.doorNo = doorNo;
        this.streetInfo = streetInfo;
        this.city = city;
        this.zipCode = zipCode;
    }

    //behaviors
    public String toString() {
        return doorNo + ", " + streetInfo + ", " + city + " - " + zipCode;
    }


}
