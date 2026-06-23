package Threads;

public class HelloThread  implements  Runnable{

    private  final  int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) Hello ThreadX form %d\n ", (i+1), threadNumber);

        }
    }
}
