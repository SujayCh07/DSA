public class LinearSearch {
    public void LinearSearch (ListADT list, String target){
        for (int i=0; i<list.size(); i++){
            if (target.equals(list.getItem(i))){
                System.out.println("Target is at index " + i);
            }
        }
    }
}
