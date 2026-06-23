package Threads;

import java.util.concurrent.Callable;

public class ReturnFuture  implements Callable<String> {

    private final String name;

    public ReturnFuture(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return name + "  Saini";
    }
}
