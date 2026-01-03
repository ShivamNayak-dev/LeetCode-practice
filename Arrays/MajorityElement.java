import java.util.ArrayList;

public class MajorityElement{
     static ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Count the frequency of arr[i]
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i])
                    cnt += 1;
            }

            // Check if arr[i] is a majority element
            if (cnt > (n / 3)) {
                // Add arr[i] only if it is not already present
                if (res.size() == 0 || arr[i] != res.get(0)) {
                    res.add(arr[i]);
                }
            }

            // If we have found two majority elements, 
            // we can stop our search
            if (res.size() == 2) {
                if (res.get(0) > res.get(1))
                    java.util.Collections.swap(res, 0, 1);
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        ArrayList<Integer> res = findMajority(arr);
        for (int ele : res)
            System.out.print(ele + " ");
    }
}