public class TestUnorderedList{
    public static void main (String [] args){
        ListADT list = new ListADT(10);
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
        list.printList();
        System.out.println("--------");
        System.out.println("Add 'a' and 'c'");
        list.addItem('a');
        list.addItem('c');
        list.printList();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
                System.out.println("--------");
        System.out.println("Add 'd' and 'f'");
        list.addItem('d');
        list.addItem('f');
        list.printList();


        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
        System.out.println("The item at index 2 is " + list.getItem(2));

        System.out.println("--------");
        System.out.println("Remove 'c'");

        list.removeItem(1);
        list.printList();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
        System.out.println("--------");
        System.out.println("Remove 'f'");
        list.removeItem(2);
        list.printList();

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
        System.out.println("--------");
        System.out.println("Remove All");
        list.removeAll();
        list.printList();
        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
    }
}