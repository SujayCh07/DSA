public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {20, 50, 10, 40, 30};
        int comp;
        list = BubbleSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] BubbleSort(int[] list) {
        int length = list.length;
        int comp = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (list[j + 1] < list[j]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    comp++;
                }
            }
        }
        System.out.println("Number of comparisons: " + comp);
        return list;
    }

}
