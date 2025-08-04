package StringInterviewQuestions;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 54231;
        int rev = 0;
        int rem = 0;
        //Using Algo
        while(num != 0){
            rev = rev * 10 + num %10;
            num = num/10;
        }
        System.out.println(rev);

        // Using String buffer
        /*System.out.println("using sf");
        long num1 = 23456;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());*/
    }
}
