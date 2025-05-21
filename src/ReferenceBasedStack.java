import FinalProject.IntNode;

public class ReferenceBasedStack {
    IntNode top;
    int numItems = 0;

    public ReferenceBasedStack(int top, int numItems) {
        this.top = null;
        this.numItems = numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int size() {
        return numItems;
    }

    public void push(int item) {
        top = new IntNode(item);
        numItems++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int item = top.getValue();
        top = top.getNext();
        numItems--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.getValue();
    }

    public void popAll(){
        top = null;
        numItems = 0;
    }
}
