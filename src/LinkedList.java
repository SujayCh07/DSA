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

    public void remove(int value){
        for (int i=0;i<size;i++){
            IntNode currentNode = head.getNext();
            if(currentNode.getValue() == value){
                head.setNext(currentNode.getNext());
            }
        }
        size--;
    }

    public void removeAll(){
        head.setNext(null);
    }

    public int getIndex(int value){
        for (int i=0;i<size;i++){
            IntNode currentNode = head.getNext();
            if(currentNode.getValue() == value){
                return i;
            }
        }
        return -1;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            IntNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }
    }
}
