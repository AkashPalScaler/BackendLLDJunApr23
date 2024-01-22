package AdderSubtractorSolution;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.*;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock;
    @Override
    public Void call(){
        for(int i=1;i<=500000;i++){
            lock.lock();
            System.out.println("Thread acquired by adder -"+ v.val);
            v.val += 1;
            lock.unlock();

        }
        return null;
    }

    public Adder(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }
}
