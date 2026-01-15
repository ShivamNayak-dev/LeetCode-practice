package BinarySearch;

import java.util.Scanner;

public class FloorValue {
    public static int floorIndex(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= x) {
                answer = mid;     // valid floor candidate
                left = mid + 1;   // move right to find last occurrence
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // print result
        System.out.println(floorIndex(arr, x));

        sc.close();
}
}
