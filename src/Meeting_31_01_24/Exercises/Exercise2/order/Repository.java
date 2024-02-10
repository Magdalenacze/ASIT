package Meeting_31_01_24.Exercises.Exercise2.order;

import java.io.*;
import java.util.Map;

public class Repository {

    private ObjectOutputStream orderOutput;
    private InMemoryOrderRepository inMemoryOrderRepository;

    public void writingToAFile(OrderRepository orderRepository) {
        try
        {
            orderOutput = new ObjectOutputStream(new FileOutputStream("Repository"));
            orderOutput.writeObject(orderRepository);
            orderOutput.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
