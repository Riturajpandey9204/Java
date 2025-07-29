package StringInterviewQuestions;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,4,5};
        int sum = 0;
        int n = a.length+1;
        int sumN = n * (n + 1) /2;
        for (int i = 0 ; i < a.length ; i++){
            sum = sum + a[i];
        }
        System.out.println(sumN - sum);
    }
}
