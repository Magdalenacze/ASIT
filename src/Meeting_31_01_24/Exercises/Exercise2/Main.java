package Meeting_31_01_24.Exercises.Exercise2;

import Meeting_31_01_24.Exercises.Exercise2.order.Order;
import Meeting_31_01_24.Exercises.Exercise2.order.InMemoryOrderRepository;
import Meeting_31_01_24.Exercises.Exercise2.order.OrderRepository;
import Meeting_31_01_24.Exercises.Exercise2.order.Repository;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static OrderRepository orderRepository;

    public static void main(String[] args) throws IOException {

        orderRepository = new InMemoryOrderRepository();
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();

        int choice = 0;

        while (true) {
            System.out.println("Select one of the options provided below:\n" +
                    "Creating an order - enter 1:\n" +
                    "Order display - enter 2:");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException ex) {
                scanner.nextLine();
            }
            switch(choice) {
                case 1:
                    createAnOrder(scanner);
                    repository.writingToAFile(orderRepository);
                    break;
                case 2:
                    displayOrder(scanner);
                    break;
                default:
                    System.out.println("Invalid value entered! Try again.");
            }
        }
    }

    private static void createAnOrder(Scanner scanner) {
        System.out.println("Enter the product name:");
        String name = scanner.next();
        System.out.println("Enter the amount:");
        Double price = scanner.nextDouble();
        scanner.nextLine();

        Order order = new Order(name, price);
        orderRepository.save(order);

        System.out.println("The order with ID " + order.getOrderId() + " has been saved!");
    }

    private static void displayOrder(Scanner scanner) {
        System.out.println("Enter your order ID:");
        long id = scanner.nextLong();

        Order order = orderRepository.getOrder(id);
        showOrderToUser(id, order);
    }

    private static void showOrderToUser(long id, Order order) {
        if (order == null) {
            System.out.println("The order with ID " + id + " not found!");
            return;
        }
        System.out.println(order);
    }
}
