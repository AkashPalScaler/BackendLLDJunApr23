package MultithreadedMergeSort;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        List<Integer> arr =
                new ArrayList<Integer>(Arrays.asList(8,6,2,9,5,4,1,3));


        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arr, es);

        Future<List<Integer>> sortedArrFuture = es.submit(sorter);
        List<Integer> sortedArr = sortedArrFuture.get();

        for(Integer i: sortedArr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
