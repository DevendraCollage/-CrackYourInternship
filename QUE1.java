import java.util.*;

public class QUE1 {
    public static int[] twoSum(int[] nums, int target) {
        int n1 = -1, n2 = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    n1 = nums[i];
                    n2 = nums[j];
                }
            }
        }
        return new int[] { n1, n2 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the targe sum of the elements : ");
        int target = sc.nextInt();

        System.out.println(twoSum(arr, target));

        sc.close();
    }
}
