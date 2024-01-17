package IntroToThreads;

import java.util.concurrent.*;

public class Client3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<100;i++){
//            if(i == 80){
//                System.out.println("DEBUG");
//            }

            PrintNumber printTask = new PrintNumber(i);
            es.execute(printTask);

        }
    }
}
