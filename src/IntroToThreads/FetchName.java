package IntroToThreads;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {

    @Override
    public String call(){
        return "Akash";
    }
}
