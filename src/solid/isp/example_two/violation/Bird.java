package solid.isp.example_two.violation;
    //Нарушение принципов сегрегации интерфейсов, набор методов избыточен для имплементаторов
public interface Bird {
    void fly();

    void run();

    void swim();
}
