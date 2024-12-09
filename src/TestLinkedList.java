public class TestLinkedList {
    public static void main (String [] args){
        LinkedList list = new LinkedList();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.getSize());
        list.display();
        System.out.println("--------");
        System.out.println("Add '1' and '3");
        list.add(1);
        list.add(3);
        list.display();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.getSize());
        System.out.println("--------");
        System.out.println("Add '4' and '6'");
        list.add(4);
        list.add(6);
        list.display();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.getSize());
        System.out.println("The item at index 2 is " + list.getIndex(2));
        System.out.println("--------");
        System.out.println("Remove '1'");
        list.remove(1);
        list.display();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.getSize());
        System.out.println("--------");
        System.out.println("Remove '2'");
        list.remove(2);
        list.display();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.getSize());
        System.out.println("--------");
        System.out.println("Remove All");
        list.removeAll();
        list.display();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.getSize());
    }
}