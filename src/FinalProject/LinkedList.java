package FinalProject;

public class LinkedList {
    private IntNode head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public LinkedList(IntNode head) {
        this.head = head;
        size = 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void add(int value) {
        IntNode newNode = new IntNode(value);

        if (head == null) {
            head = newNode;
        } else {
            IntNode currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }

        size++;
    }

    public void remove(int value) {
        if (head == null) return;

        // If the head is the one to remove
        if (head.getValue() == value) {
            head = head.getNext();
            size--;
            return;
        }

        IntNode currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getValue() == value) {
                currentNode.setNext(currentNode.getNext().getNext());
                size--;
                return;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void removeAll() {
        head = null;
        size = 0;
    }

    public int getIndex(int value) {
        IntNode currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                return index;
            }
            currentNode = currentNode.getNext();
            index++;
        }
        return -1;
    }

    public void displayOrder() {
        if (head == null) {
            System.out.println("Order is empty");
            return;
        }

        IntNode currentNode = head;
        while (currentNode != null) {
            int code = currentNode.getValue();
            System.out.println("Item: " + Menu.getItemName(code));
            currentNode = currentNode.getNext();
        }
    }
}
