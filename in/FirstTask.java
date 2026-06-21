package TopProgram;

public class FirstTask extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\nFirst Task Completed");
    }
}