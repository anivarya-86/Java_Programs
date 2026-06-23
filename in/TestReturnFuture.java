package Threads;

import java.util.concurrent.*;

public class TestReturnFuture {

     public static void main(String[] args) throws ExecutionException, InterruptedException {
         ExecutorService service = Executors.newFixedThreadPool(2);

         ReturnFuture task1 = new ReturnFuture("Anivarya");
         ReturnFuture task2 = new ReturnFuture("Lenovo");
         ReturnFuture task3 = new ReturnFuture("Annu");
         ReturnFuture task4 = new ReturnFuture("Wifi");

         Future<String> name1 = service.submit(task1);
         Future<String> name2 = service.submit(task2);
         Future<String> name3 = service.submit(task3);
         Future<String> name4 = service.submit(task4);

         System.out.printf("\n Full name is %s" , name1.get());
         System.out.printf("\n Full name is %s" , name2.get());
         System.out.printf("\n Full name is %s" , name3.get());
         System.out.printf("\n Full name is %s" , name4.get());

      service.shutdown();
    }
}
