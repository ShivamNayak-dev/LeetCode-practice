import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Firstnegativeinteger {
    public static int[] firstNegInt(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        
        // Loop for each subarray(window) of size k
        for (int i = 0; i <= (n - k); i++) {
            boolean found = false;
            
            // traverse through the current window
            for (int j = 0; j < k; j++) {
                
                // if a negative integer is found, then 
                // it is the first negative integer for 
                // the current window. Set the flag and break
                if (arr[i + j] < 0) {
                    res.add(arr[i + j]);
                    found = true;
                    break;
                }
            }
            // if the current window does not contain 
            // a negative integer
            if (!found) {
                res.add(0);
            }
        }
        // Convert List to int[]
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] res = firstNegInt(arr, k);
        System.out.print(Arrays.toString(res));
    }
}
