package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iRepo;
import Model.Domain.Customer;
import Model.Domain.Order;
import Model.Domain.Table;

public class Repository implements iRepo {
    private List<Order> orders;
    private List<Customer> customers;
    private List<Table> tables;

    public Repository(List<Order> orders, List<Customer> customers, List<Table> tables) {
        this.orders = orders;
        this.customers = customers;
        this.tables = tables;
    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public List<Order> getOrderByCustomer(Customer customer) {
        ArrayList<Order> result = new ArrayList<>();
        String phoneCusromer = customer.getPhone();
        for (Order order : this.orders) {
            if (order.getCustomer().getPhone().equals(phoneCusromer)) {
                result.add(order);
            }
        }
        return result;
    }

    @Override
    public boolean addNewOrder(Order order) {
        return orders.add(order);
    }

    @Override
    public boolean deleteOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                orders.remove(order);
                return true;
            }
        }
        return false;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return this.customers;
    }

    @Override
    public Table getTableById(int id) {
        for (Table table : tables) {
            if (table.getId() == id) {
                return table;
            }
        }
        return null;
    }

    @Override
    public Customer getCustomerByPhone(String phone) {
        for (Customer customer : customers) {
            if (customer.getPhone().equals(phone)) {
                return customer;
            }
        }
        return null;
    }

}