package solid.srp.solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplementation(), new DataManagementImplementation());
        phone.dial("8-800-555-35-35");
        phone.send("message");
        phone.receive();
        phone.disconnect();
    }
}
