public class CustomerRunner {
    public static void main(String[] args) {
        //Customer customer = new Customer();
        Address homeAddress = new Address("Flat No. 51", "Hiranandani Gardens", "Mumbai", "400076");
        Customer customer = new Customer("Ashwin Tendulkar", homeAddress);
        System.out.println(customer);
        Address workAddress = new Address("Administrative Office", "Western Block", "Mumbai", "400076");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
