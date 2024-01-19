package MultithreadedMergeSort;
import java.util.*;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>>{

    List<Integer> arrToSort;
    ExecutorService es;


    public Sorter(List<Integer> arrToSort, ExecutorService es){
        this.es = es;
        this.arrToSort = arrToSort;
    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException{

        if(arrToSort.size() <= 1){
            return arrToSort;
        }

        int size = arrToSort.size();
        int mid = size/2;

        List<Integer> leftArr = new ArrayList<Integer>();
        List<Integer> rightArr = new ArrayList<Integer>();

        for(int i=0;i<mid;i++){
            leftArr.add(arrToSort.get(i));
        }

        for(int i=mid;i<size;i++){
            rightArr.add(arrToSort.get(i));
        }

        //Create the task
        Sorter leftSorter = new Sorter(leftArr, this.es);
        Sorter rightSorter = new Sorter(rightArr, this.es);

//        ExecutorService es = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSorterFuture = this.es.submit(leftSorter);
        Future<List<Integer>> rightSorterFuture = this.es.submit(rightSorter);

        List<Integer> sortedLeftArray = leftSorterFuture.get();
        List<Integer> sortedRightArray = rightSorterFuture.get();

        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        List<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }


}
