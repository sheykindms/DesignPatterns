package solid.srp.solution;

public class DataManagementImplementation implements IDataManager {
    @Override
    public void send(String message) {
        System.out.println("Data has been sent");
    }

    @Override
    public int receive() {
        System.out.println("Data has been received");
        return 0;
    }
}
