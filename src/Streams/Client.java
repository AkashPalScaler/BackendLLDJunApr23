package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Client {
    public static boolean checkEven(Integer x){
        return x%2 == 0;
    }
    public static void main(String[] args) {
        List<Integer> arList = Arrays.asList(1,4,5,7,2,3,8);

        List<Integer> evenList = new ArrayList<>();
        //Way 1
        for(Integer x : arList){
            if(checkEven(x)){
                evenList.add(x);
            }
        }

        //Way 2

        Predicate<Integer> checkEvenPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        };

        Predicate<Integer> greaterThan10 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>10;
            }
        };

        evenList = arList.stream()
                .filter(checkEvenPredicate)
                .filter(greaterThan10)//Intermediate function
                .collect(Collectors.toList()); //Terminal function


        //Way 3

        evenList = arList.stream()
                .filter((x) -> { return x%2 == 0;})
                .collect(Collectors.toList());


        //Way 4

        evenList = arList.stream()
                    .filter(x -> x%2==0)//Just when one parameter and one line body is there
                    .collect(Collectors.toList());

        System.out.println("EVEN : " + evenList.toString());

        Function<Integer, Integer>  funSquare =
                new Function<Integer, Integer>(){
                    @Override
                    public Integer apply(Integer x){
                        return x*x;
                    }
                };

        List<Integer> doubleList = arList.stream()
                                    .map(funSquare)
                                    .collect(Collectors.toList());


        doubleList = arList.stream()
                        .map(x -> x*x)
                        .collect(Collectors.toList());

        System.out.println("SQUARE : "+ doubleList.toString());

        arList.stream()
                .map(x -> "Hello  " + x)
                .forEach( x -> System.out.println(x));


        int sum = 0;

        for(Integer a: arList){
            sum = sum + a;
        }

        int sum2 = arList.stream()
                .reduce(0, (s, x) -> s+x);

        //Finding max

        int maxV = Integer.MIN_VALUE;

        for(Integer a : arList){
            maxV = Math.max(maxV, a);
        }


        int maxV2 = arList.stream().reduce(Integer.MIN_VALUE,
                (m, x) -> {return Math.max(m, x);});



    }
}
