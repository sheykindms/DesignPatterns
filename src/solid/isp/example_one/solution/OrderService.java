package solid.isp.example_one.solution;

public interface OrderService {
    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);
}
