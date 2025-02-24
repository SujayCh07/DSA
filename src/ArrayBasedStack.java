public class ArrayBasedStack {
    int top = -1;
    int size;
    int[] array;
    int numItems = 0;

    public ArrayBasedStack(int top, int size, int numItems) {
        this.top = top;
        this.size = size;
        this.numItems = numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int size() {
        return numItems;
    }

    public void push(int item) {
        top++;
        numItems++;
        array[top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int item = array[top];
        numItems--;
        array[top] = 0;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return array[top];
    }

    public void popAll(){
        top = -1;
        numItems = 0;
    }
}
