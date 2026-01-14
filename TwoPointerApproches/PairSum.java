public class PairSum{
    static ArrayList<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length;

        ArrayList<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int currSum = arr[i] + arr[j];
                int currDiff = Math.abs(currSum - target);

                
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    res = new ArrayList<>(Arrays.asList(
                        Math.min(arr[i], arr[j]),
                        Math.max(arr[i], arr[j])
                    ));
                }

                
                else if (currDiff == minDiff && 
                        (res.get(1) - res.get(0)) < Math.abs(arr[i] - arr[j])) {
                    res = new ArrayList<>(Arrays.asList(
                        Math.min(arr[i], arr[j]),
                        Math.max(arr[i], arr[j])
                    ));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        ArrayList<Integer> res = sumClosest(arr, target);
        if (!res.isEmpty())
            System.out.println(res.get(0) + " " + res.get(1));
    }
}