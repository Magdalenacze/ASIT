package Meeting_31_01_24.Exercises.Exercise2.order;

public class Order {

    private static long ID_COUNTER = 0;
    private Long orderId;
    private String productName;
    private Double price;

    public Order(String productName, Double price) {
        this.productName = productName;
        this.price = price;
        this.orderId = ID_COUNTER;
        ID_COUNTER++;
    }

    public Long getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order:\n" +
                "orderId: " + orderId + "\n" +
                "productName: " + productName + "\n" +
                "price: " + price;
    }
}
