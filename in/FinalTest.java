package FunctionalProgram;

import java.util.List;

public class FinalTest {
    public static void main(String[] args) {
        List<String> num = List.of("2", "4","6", "7");
        num.stream()
                .map(Integer::parseInt)
                .map(num1-> Math.pow(num1 , 2 ))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
