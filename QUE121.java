import java.util.*;

public class QUE121 {
    public static int maxProfit(int[] arr) {
        int profit = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (max > arr[i]) {
                max = arr[i];
            } else {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                min = arr[j];
                int net = min - max;
                if (profit < net) {
                    profit = net;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));

        sc.close();
    }
}
