package TopProgram;

public class ThreadAll {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdClass t3 = new ThirdClass();

        t1.start();
        t2.start();
        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }

}
