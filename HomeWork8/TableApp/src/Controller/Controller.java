package Controller;

import Controller.Interfaces.iRepo;
import Controller.Interfaces.iView;
import Model.Domain.Order;

public class Controller {
    private iRepo repository;
    private iView view;

    public Controller(iRepo repository, iView view) {
        this.repository = repository;
        this.view = view;
    }

    public void loadOrders() {
        view.printOrders(repository.getAllOrders());
    }

    public void deleteOrder(Order order) {
        if (repository.deleteOrderById((int) order.getId())) {
            view.successMessage();
        } else {
            view.failedMessage();
        }
        loadOrders();
    }

    public void updateCustomers() {
        view.printCustomers(repository.getAllCustomer());
    }

    public String getUserInput(){
        view.startMessage();
        return view.listerTerminal();
    }

    public void createOrder(){ 
        // Вводится информация вида: enter your phone, number of table, date, time, number of persons      
        String[] inputData = getUserInput().split(" ");  
        // Будем считать, что пользователь уже создан, идентификация проходит по номеру телефона, который уникален у каждого. 
        Order newOrder = new Order(repository.getTableById(Integer.parseInt(inputData[1])), inputData[2], inputData[3], Integer.parseInt(inputData[4]), repository.getCustomerByPhone(inputData[0]));
        repository.addNewOrder(newOrder);
        view.successMessage();
    }

    

}
