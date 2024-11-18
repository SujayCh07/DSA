public class SelectionSort {
    private int min;
    private int max;
    private int mid;

    public static void main(String[] args) {
        int[] list = {20, 50, 10, 40, 30};
        list = MaxSelectionSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();

        list = MinSelectionSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }

    public static int[] MaxSelectionSort(int[] list) {
        int length = list.length;
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (list[j] < list[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = list[maxIndex];
            list[maxIndex] = list[i];
            list[i] = temp;
        }

        return list;
    }


    public static int[] MinSelectionSort(int[] list) {
        int length = list.length;
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (list[j] > list[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = list[maxIndex];
            list[maxIndex] = list[i];
            list[i] = temp;
        }

        return list;
    }
}
