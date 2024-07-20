import java.util.*;

public class QUE283 {
    public static void moveZeros(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }

        System.out.println("\nAfter Move Zeros to The End Of The Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Array : ");
        int size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];

        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        sc.close();
    }
}
