package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestServiceExecutor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        HelloThread task1 = new HelloThread(3);;
        service.submit(task1);

        service.shutdown();
    }
}
