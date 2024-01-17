package IntroToThreads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FetchName nameTask = new FetchName();

        ExecutorService es = Executors.newCachedThreadPool();

        Future<String> futureName = es.submit(nameTask);

        String name = futureName.get();
    }
}
