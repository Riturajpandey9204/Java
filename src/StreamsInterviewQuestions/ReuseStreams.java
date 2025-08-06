package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStreams {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Rohan", "Sohan", "Mohan");
        Supplier<Stream<String>> streamSupplier = () -> listOfString.stream();
        //consumption 1
        streamSupplier.get().forEach(System.out::println);
        //consumption 2
        Long count = streamSupplier.get().count();
        System.out.println(count);
    }
}
