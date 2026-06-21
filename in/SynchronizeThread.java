package TopProgram;

public class SynchronizeThread {

    private int count = 1;

    public synchronized void increment(){
        count++;

    }
    public int getCount(){
        return count;
    }

}
