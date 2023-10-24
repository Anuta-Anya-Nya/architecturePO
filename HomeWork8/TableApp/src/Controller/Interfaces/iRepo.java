package Controller.Interfaces;

import java.util.List;

import Model.Domain.Customer;
import Model.Domain.Order;
import Model.Domain.Table;

public interface iRepo {
    public List<Order> getAllOrders();

    public List<Customer> getAllCustomer();

    public List<Order> getOrderByCustomer(Customer customer);

    public boolean addNewOrder(Order order);

    public boolean deleteOrderById(int id);

    public Table getTableById(int id);

    public Customer getCustomerByPhone(String phone);


}
