public class BinarySearch {
    private int min;
    private int max;
    private int mid;

    public void BinarySearch (ListADT list, String target){
        min = 0;
        max = list.size() - 1;
        mid = (max+min)/2;
        boolean found = false;

        while (!found) {
            if ((target.compareTo(list.getItem(mid))) > 0) {
                min = mid + 1;
                mid = (max + min) / 2;
            } else if ((target.compareTo(list.getItem(mid))) < 0) {
                max = mid - 1;
                mid = (max + min) / 2;
            } else {
                found = true;
                System.out.println("Target is at index " + mid);
            }
        }
    }
}
