package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void>{
    Value v;
    @Override
    public Void call(){
        for(int i=1;i<=5000;i++){
            System.out.println("Thread acquired by subtractor -"+ v.val);
            v.val -= 1;
        }
        return null;
    }

    public Subtractor(Value v){
        this.v = v;
    }
}

