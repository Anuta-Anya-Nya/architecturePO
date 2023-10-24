package Controller.Interfaces;

import java.util.List;

import Model.Domain.Customer;
import Model.Domain.Order;

public interface iView {
    public void printOrders(List<Order> orders);

    public void printCustomers(List<Customer> customers);

    public void startMessage();

    public void successMessage();

    public void failedMessage();

    public String listerTerminal();
}
