package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;
    @Override
    public Void call(){
        for(int i=1;i<=5000;i++){
            System.out.println("Thread acquired by adder -"+ v.val);
            v.val += 1;
        }
        return null;
    }

    public Adder(Value v){
        this.v = v;
    }
}
