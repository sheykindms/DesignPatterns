package creational.singleton.enum_singleton;

public class ClientTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.GETINSTANCE;
        Singleton singleton2 = Singleton.GETINSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println(singleton1.getString());
    }
}
