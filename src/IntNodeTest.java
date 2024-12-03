public class IntNodeTest {
    public static void main(String[] args) {
        IntNode n1 = new IntNode(1);
        IntNode n2 = new IntNode(2);
        IntNode n3 = new IntNode(3);
        IntNode n4 = new IntNode(4);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n1.getNext().getValue();
        //n1.setNext(null);
        //n2.setNext(null);
        //n3.setNext(null);
        //System.out.println(n1.getNext().getValue());
        IntNode curr = n1;
        //curr = n1.getNext();
        while(curr != null){
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }

        IntNode head;
        head = new IntNode(5);
        head = new IntNode(6, head);
    }
}