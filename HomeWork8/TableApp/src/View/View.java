package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iView;
import Model.Domain.Customer;
import Model.Domain.Order;

public class View implements iView {
    private static final String startMessage = "Make a table reservation: enter your phone, number of table, date, time, number of persons";
    private static final String successMessage = "All OK!";
    private static final String failedMessage = "Something's wrong";    

    @Override
    public void printOrders(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    
    @Override
    public void printCustomers(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void startMessage() {
        System.out.println(startMessage);
    }

    @Override
    public void successMessage() {
        System.out.println(successMessage);
    }

    @Override
    public void failedMessage() {
        System.out.println(failedMessage);
    }


    @Override
    public String listerTerminal() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        sc.close();
        return userInput;
    }
  
}
