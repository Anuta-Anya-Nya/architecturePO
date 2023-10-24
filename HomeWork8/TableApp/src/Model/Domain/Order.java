package Model.Domain;

public class Order {
    private static int countOrders = 0;
    private long id;
    private Table table;
    private String date;
    private String time;
    private int persons;
    private Customer customer;

    public Order(Table table, String date, String time, int persons, Customer customer) {
        this.id = countOrders;
        countOrders++;
        this.table = table;
        this.date = date;
        this.time = time;
        this.persons = persons;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public Table getTable() {
        return table;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getPersons() {
        return persons;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", table=" + table.getId() + ", date=" + date + ", time=" + time + ", persons=" + persons
                + ", customer=" + customer.getName() + "]";
    }

}
