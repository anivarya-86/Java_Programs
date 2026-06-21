package TopProgram;

public class ThirdClass extends Thread {
    @Override
    public void run() {

    for (int i = 0; i < 100; i++) {
            System.out.printf("%d& ", i);
        } System.out.println("\nThird Task Completed");
    }
}
