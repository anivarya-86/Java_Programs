package MostPrograms;

import TopProgram.SleepState;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTEst {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            ThreadPool task = new ThreadPool();
            service.submit(task);
        }

        if (!service.awaitTermination(15, TimeUnit.SECONDS)){
            System.out.println("EMERGENCY SHUTDOWN");
            service.shutdown();
        }
    }
}
