public class Customer {
    // state of the Object
    private String name;
    private Address homeAddress;
    private Address workAddress;

    // creating
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("Customer [%s] lives at [%s], works at [%s]",
                name,
                homeAddress,
                workAddress);
    }

}
