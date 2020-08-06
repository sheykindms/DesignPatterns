package solid.srp.violation;

//Метод, нарушающий SRP
public interface IPhone {
    //Методы отвечающие за Connection management
    void dial(String phoneNumber);
    void disconnect();

    //Методы отвечающие за Data management
    void send(String message);
    int receive();
}
