package again;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.list;

public class ListSwapping {
    public static void main() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list);
        swap(list, 5, 4);
        System.out.println(list);
    }
    public static void swap(List<Integer> list , int x , int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list .set( y , swap);
    }


}
