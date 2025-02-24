import java.lang.reflect.Constructor;

public class Customer {
    private int arrival;
    private int service;
    private String customer;
    private Customer nextCustomer;

    public Customer(int arrival, int service, String customer, Customer nextCustomer){
        this.arrival = arrival;
        this.service = service;
        this.customer = customer;
        this.nextCustomer = nextCustomer;
    }

    public int getArrival() {
        return arrival;
    }
    public int getService() {
        return service;
    }
    public String getCustomer() { return customer; }
    public Customer getNextCustomer() { return nextCustomer; }
    public void setArrival(int arrival) {
        this.arrival = arrival;
    }
    public void setService(int service) {
        this.service = service;
    }
    public void setCustomer(String customerl) {
        this.customer = customerl;
    }
    public void setNextCustomer(Customer nextCustomer) {
        this.nextCustomer = nextCustomer;
    }
    public String display(){
        return (arrival + ", " + service + ", " + customer);
    }
}
