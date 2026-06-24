package MostPrograms;

public class ThreadPool  implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Thread Start : %s\n " , current.getName());
        System.out.printf("Current Thread %s\n " , current.getName());

        try {
            Thread.sleep(getRandom() *1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Thread Ended %s\n" , current.getName());
    }
    private  int getRandom(){
        double random = Math.random() * 5 + 1 ;
        return (int)random;
    }
}
