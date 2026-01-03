
public class SumOfSubarrays {
    static void calcSum(int arr[], int n, int k)
{
   
    int sum = 0;

    
    for (int i = 0; i < k; i++)
        sum += arr[i];

    
    System.out.print(sum+ " ");

    
    for (int i = k; i < n; i++) {
        
        
        sum = (sum - arr[i - k]) + arr[i];
        
        
        System.out.print(sum+ " ");
    }
}


public static void main(String[] args)
{
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int n = arr.length;
    int k = 3;
    
    // Function Call
    calcSum(arr, n, k);
}
}
