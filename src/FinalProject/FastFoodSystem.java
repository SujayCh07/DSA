package FinalProject;

public class FastFoodSystem {
    public static void main(String[] args) {
        //The queue represents the number of customers in line
        ReferenceBasedQueue customerQueue = new ReferenceBasedQueue();

        //Each linked list holds an order per customer
        LinkedList[] order = new LinkedList[10]; // Supports up to 10 customers at a time

        //The stack is like a receipt that holds previous orders
        ArrayBasedStack recentOrders = new ArrayBasedStack(0, 100, 0);

        //Two customers come in a line
        addCustomerOrder(1, new int[]{1, 2, 3}, order, customerQueue); // Burger, Fries, Drink
        addCustomerOrder(2, new int[]{4, 5}, order, customerQueue); // Salad, Shake

        //Modifying an order
        order[1].remove(4);

        System.out.println("\n--- Serving Orders ---");
        while (!customerQueue.isEmpty()) {
            int customerId = customerQueue.dequeue();

            if (customerId == -1) {
                System.out.println("All customers have been served");
                break;
            }

            int customerIndex = customerId - 1;

            System.out.println("Customer " + customerId + "'s order:");
            order[customerIndex].displayOrder();
            System.out.println();

            recentOrders.push(customerId);
        }

        System.out.println("\n--- Recently Served Customers ---");
        while (!recentOrders.isEmpty()) {
            int servedCustomer = recentOrders.pop();
            System.out.println("Customer " + servedCustomer);
        }
    }

    public static void addCustomerOrder(int customerId, int[] itemCodes, LinkedList[] orders, ReferenceBasedQueue queue){
        LinkedList orderList = new LinkedList();
        for (int code : itemCodes) {
            orderList.add(code);
        }
        orders[customerId-1] = orderList;
        queue.enqueue(customerId);
    }
}