package FI;

@FunctionalInterface
interface DiffFinder{
    long diff(int a, int b);
}
public class FindDiffBetTwoNumbers {
    public static void main(String[] args) {
        DiffFinder diffFinder = (a,b) -> a - b;
        System.out.println(diffFinder.diff(4,7));
    }
}
