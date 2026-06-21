package TopProgram;



public class UpdaterThread  extends Thread{


    private SynchronizeThread synchronizeThread;

    public UpdaterThread(SynchronizeThread synchronizeThread){
        this.synchronizeThread = synchronizeThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronizeThread.increment();

        }
    }
}
