package Meeting_31_01_24.Exercises.Exercise2.order;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository, Serializable {

    private Map<Long, Order> orderMap;

    public InMemoryOrderRepository() {
        orderMap = new HashMap<>();
    }

    @Override
    public void save(Order o) {
        orderMap.put(o.getOrderId(), o);
    }

    @Override
    public Order getOrder(Long orderId) {
        return orderMap.get(orderId);
    }
}
