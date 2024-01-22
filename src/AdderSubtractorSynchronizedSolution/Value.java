package AdderSubtractorSynchronizedSolution;

public class Value {
    private int val;

    public int getVal(){
        return val;
    }

    synchronized public void increment(){
        //lock
        val += 1;
        //unlock
    }

    synchronized public void decrement(){
        val -= 1;
    }
}
