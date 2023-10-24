
import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.Interfaces.iRepo;
import Controller.Interfaces.iView;
import Model.Repository;
import Model.Domain.Customer;
import Model.Domain.Hall;
import Model.Domain.Order;
import Model.Domain.Photo;
import Model.Domain.Table;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        Photo photo = new Photo("img1.jpg");
        Hall hall = new Hall("MainRoom", photo);

        List<Table> tables = new ArrayList<Table>();
        Table table1 = new Table(4, hall, photo);
        tables.add(table1);

        List<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer("Ivan Petrov", "21-12-1988", "8-905-416-44-38");
        Customer customer2 = new Customer("Petr Ivanov", "20-01-1990", "8-928-311-34-56");
        customers.add(customer1);
        customers.add(customer2);

        List<Order> orders = new ArrayList<Order>();
        Order order1 = new Order(table1, "23-10-2023", "19-00", 2, customer1);
        Order order2 = new Order(table1, "23-10-2023", "20-00", 3, customer2);
        orders.add(order1);
        orders.add(order2);

        iRepo repo = new Repository(orders, customers, tables);
        iView view = new View();

        Controller controller = new Controller(repo, view);

        controller.loadOrders();
        controller.deleteOrder(order2);
        controller.updateCustomers();
        controller.createOrder();
        // Ввод пользователя: 8-905-416-44-38 1 23-10-2023 19-00 2
        controller.loadOrders();

    }
}
