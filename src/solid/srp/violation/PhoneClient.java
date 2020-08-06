package solid.srp.violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("8-800-555-35-35");
        phone.send("message");
        phone.receive();
        phone.disconnect();
    }
}
