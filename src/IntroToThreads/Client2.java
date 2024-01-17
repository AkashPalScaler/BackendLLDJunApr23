package IntroToThreads;

public class Client2 {
    public static void main(String[] args) {
        for(int i=0;i<100000;i++){
            PrintNumber printTask = new PrintNumber(i);
            Thread t = new Thread(printTask);
            t.start();
        }
    }
}
