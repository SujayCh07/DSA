public class MergeSort {
    private static int min;
    private static int max;
    private static int mid;

    public static void main(String[] args) {
        int[] list = {20, 50, 10, 40, 30};
        int comp;
        list = MergeSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] MergeSort(int[] list) {
        min = 0;
        max = list.length;
        mid = (max + min) / 2;

        int[] a1 = new int[mid];
        int[] a2 = new int[max - min];

        for (int i = 0; i < mid; i++) {
            a1[i] = list[i];
        }
        for (int i = mid; i < list.length; i++) {
            a2[i - mid] = list[i];
        }

        a1 = MergeSort(a1);
        a2 = MergeSort(a2);

        // Merge the sorted halves
        return merge(a1, a2);
    }

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a2.length + a2.length];
        int i = 0, j = 0, k = 0;

        // Merge the arrays by comparing the elements
        while (i < a2.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        // Copy any remaining elements from left
        while (i < a1.length) {
            result[k++] = a1[i++];
        }

        // Copy any remaining elements from right
        while (j < a2.length) {
            result[k++] = (a2[j++]);
        }

        return result;
    }
}
