public class QUE88 {
    public static void merge(int[] arr1, int n, int[] arr2, int m) {
        int i = n - 1;
        int j = m - 1;
        int pMerge = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[pMerge--] = arr1[i--];
            } else {
                arr1[pMerge--] = arr2[j--];
            }
        }
    }
}
