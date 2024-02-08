package Meeting_31_01_24.Exercises.Exercise2.order;

public interface OrderRepository {

    void save(Order o);
    Order getOrder(Long orderId);
}
