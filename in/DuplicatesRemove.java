package FunctionalProgram;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesRemove {
    public static void main(String[] args) {
        List<Integer> task = List.of(1,2,5,2,3,9,1,5,1,1,2,8);
        List<Integer> task2 =  task.stream().distinct()
                 .collect(Collectors.toList());
        System.out.println(task);
        System.out.println(task2);
    }
}
