import java.util.*;

public class QUE122 {
    public static long minDiff(ArrayList<Integer> a, int n, int m) {
        if (a.size() == 0) {
            return 0;
        }
        Collections.sort(a);
        long res = Long.MAX_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            int minElem = a.get(i);
            int maxElem = a.get(i + m - 1);
            res = Math.min(res, maxElem - minElem);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        System.out.print("Enter the number of chocolates : ");
        int choco = sc.nextInt();

        System.out.print("Enter the number of packets : ");
        int packets = sc.nextInt();
        System.out.println();

        ArrayList<Integer> arr = new ArrayList<>(size);
        sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("[%d] : ", i);
            int elem = sc.nextInt();
            arr.add(elem);
        }

        System.out.println(minDiff(arr, choco, packets));

        sc.close();
    }
}