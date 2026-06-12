package again;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1,2,65,145,1,4,5,564,4,2,3,4,2,3,2);

        System.out.println(Collections.frequency(list , 1));
        System.out.println(Collections.frequency(list , 2));
        System.out.println(Collections.frequency(list , 4));
    }
}