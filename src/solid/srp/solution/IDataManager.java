package solid.srp.solution;

public interface IDataManager {
    void send(String message);

    int receive();
}
