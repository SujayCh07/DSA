public class IntegerNode {
    private int item;
    private IntegerNode next;

    public IntegerNode (int newItem){
        item = (int) newItem;
        next = null;
    }

    public IntegerNode (int newItem, IntegerNode next){
        item = (int) newItem;
        this.next = next;
    }

    public static void main(){
        IntegerNode head, p, q;
        int x;

        //p = new IntegerNode();

        //p = new IntegerNode(1, head);

        /*
        p = new IntegerNode(1);
        q = new IntegerNode(3, p);
        p.next = head;
        head = q;

        x = 3;
        p = new IntegerNode(x, head);

         */
    }
}
