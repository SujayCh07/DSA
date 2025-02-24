public class Arrival {
    Customer front;
    Customer back;
    int numCustomers = 0;

    public Arrival(int top, int back) {
        this.front = null;
        this.back = null;
    }

    public boolean isEmpty() {
        return numCustomers == 0;
    }

    public int size() {
        return numCustomers;
    }

    public void addCustomer(int arrivalTime, int serviceTime, String name) {
        if (isEmpty()) {
            front = new Customer(arrivalTime, serviceTime, name, null);
            back = front;
            numCustomers++;
        }
        else {
            Customer newNode = new Customer(arrivalTime, serviceTime, name, null);
            back.setNextCustomer(newNode);
            back = newNode;
            numCustomers++;
        }
    }

    public String removeCustomer() {
        if (numCustomers == 1) {
            this.front = null;
            this.back = null;
            return front.getCustomer();
        }
        numCustomers--;
        front.setNextCustomer(front.getNextCustomer());
        return front.getCustomer();
    }

    public String[] displayArrivalList(){
        String[] arrivalList = new String[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            arrivalList[i] = front.getCustomer();
            front = front.getNextCustomer();
        }
        return arrivalList;
    }
}
