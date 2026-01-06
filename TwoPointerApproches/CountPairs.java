public class CountPairs {
    static int countPairs(int[] arr, int k) {
        int n = arr.length;
        int cnt = 0;

       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
              
                
                if (Math.abs(arr[i] - arr[j]) == k) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 5};
        int k = 3;

        System.out.println(countPairs(arr, k));
    }
}
