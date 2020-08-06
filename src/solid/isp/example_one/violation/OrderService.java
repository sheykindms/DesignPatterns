package solid.isp.example_one.violation;
//Нарушение принципа isp
public interface OrderService {
    //Frontend methods
    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);
    //Backend method
    boolean processOrder(int orderId);
}
