public class ListADT {
    private int[] array;
    private int size;
    public static void main(String[]args){
        ListADT arr = new ListADT(5);
        arr.addItem(0,7);
        arr.addItem(1,-8);
        arr.addItem(2,47);
        arr.addItem(3,14);
        arr.addItem(3,2);
        arr.removeItem(3);
        arr.removeAll();
        System.out.println(arr.isEmpty());
        arr.printList();
    }
    public ListADT(int capacity){
        array = new int[capacity];
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void addItem(int index, int num){
        if(index == size){
            array[index] = num;
        }
        else{
            for (int i = index; i < size; i++){
                int temp = array[index];
                array[index] = num;
                array[i + 1] = temp;
            }
        }
        size++;
    }
    public void removeItem(int index){
        if(index == size){
            array[index] = 0;
        }
        else{
            int num = 0;
            array[index] = num;
            for (int i = size; i > index; i--){
                int temp = array[index];
                array[index] = num;
                array[i - 1] = temp;
            }
        }
        size--;
    }
    public void removeAll(){
        array = new int[size];
        size = 0;
    }
    public int getItem(int index){
        return array[index];
    }
    public void printList(){
        for(int i = 0; i < size; i++){
            System.out.print(getItem(i) + " ");
        }
    }


}
