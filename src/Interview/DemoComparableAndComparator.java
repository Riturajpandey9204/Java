package Interview;

import java.util.*;

public class DemoComparableAndComparator {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        List<Integer> integerList = Arrays.asList(10,52,34,89,65,48);

        Collections.sort(integerList,comp);
        System.out.println(integerList);


    }
}
