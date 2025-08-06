package StreamsInterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
       List<Integer> fibonacci =  Stream.iterate(new int[]{0,1},f-> new int[]{f[1],f[0]+f[1]})
               .limit(20).map(f->f[0]).collect(Collectors.toList());
        System.out.println(fibonacci);
    }
}
