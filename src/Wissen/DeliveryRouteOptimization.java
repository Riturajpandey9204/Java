package Wissen;

public class DeliveryRouteOptimization {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 6, -2};
        int n = arr.length;
        System.out.println(optimizedRoute(arr, n));
    }

    private static int optimizedRoute(int[] arr, int n) {
        int totalSum = 0;
        for (int num : arr){
            totalSum+=num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
          int rightSum = totalSum - leftSum - arr[i];
          if(leftSum == rightSum){
              return i+1;
          }
          leftSum += arr[i];
        }
        return -1;
    }
}
