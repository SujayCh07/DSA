public class ListADT {
    private char[] array;
    private int size;
    public static void main(String[]args){

    }
    public ListADT(int capacity){
        array = new char[capacity];
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void addItem(char num){
        array[size] = num;
        size++;
    }

    public void addItem(int index, char num){
        if(index == size){
            array[index] = num;
        }
        else{
            for (int i = index; i < size; i++){
                char temp = array[index];
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
            char num = 0;
            array[index] = num;
            for (int i = size; i > index; i--){
                char temp = array[index];
                array[index] = num;
                array[i - 1] = temp;
            }
        }
        size--;
    }
    public void removeAll(){
        array = new char[size];
        size = 0;
    }

    public String getItem(int index){
        return Character.toString ((char) array[index]);
    }
    public void printList(){
        for(int i = 0; i < size; i++){
            System.out.print(getItem(i) + " ");
        }
    }



}
