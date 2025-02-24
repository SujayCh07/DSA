public class ReferenceBasedQueue {
    IntNode front;
    IntNode back;
    int numItems = 0;

    public ReferenceBasedQueue(int top, int back) {
        this.front = null;
        this.back = null;
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
        if (numItems == 1) {
            dequeueAll();
            return front.getValue();
        }
        numItems--;
        front.setNext(front.getNext());
        return front.getValue();
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
