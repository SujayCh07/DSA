package FinalProject;

public class ReferenceBasedQueue {
    IntNode front;
    IntNode back;
    int size;
    int numItems = 0;

    public ReferenceBasedQueue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int size() {
        return numItems;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            front = new IntNode(item);
            back = front;
            numItems++;
        }
        else {
            IntNode newNode = new IntNode(item);
            back.setNext(newNode);
            back = newNode;
            numItems++;
        }
    }

    public int dequeue() {
        if (front == null) {
            return -1;
        }

        int value = front.getValue();
        front = front.getNext();
        size--;

        if (front == null) {
            back = null;
        }

        return value;
    }

    public int peek() {
        return front.getValue();
    }

    public void dequeueAll(){
        front = null;
        back = null;
        numItems = 0;
    }
}
