package AdderSubtractorSolution;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void>{
    Value v;
    Lock lock;
    @Override
    public Void call(){
        for(int i=1;i<=500000;i++){
            lock.lock();
            System.out.println("Thread acquired by subtractor -"+ v.val);
            v.val -= 1;
            lock.unlock();
        }
        return null;
    }

    public Subtractor(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }
}

