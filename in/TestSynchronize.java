package TopProgram;

public class TestSynchronize {
    public static void main(String[] args) {
    SynchronizeThread synchronizeThread = new SynchronizeThread()  ;
    UpdaterThread t1 = new UpdaterThread(synchronizeThread);
    UpdaterThread t2 = new UpdaterThread(synchronizeThread);
    long starttime = System.currentTimeMillis();
    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        System.out.println("Thread interrupted: "+ e.getMessage());
    }
    long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value : %d and" + "Time taken : %d",
        synchronizeThread.getCount(), (endTime- starttime));
    }

}
