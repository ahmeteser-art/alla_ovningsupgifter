package se.chasacademy.ahmeteser.KURS_2_.vecka1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPI {


    void main() {

        //duplicate numbers in a list and remove them using stream API
        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(List.of(1,1,1,1,1,1,1,1,1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10));


       numbers=  numbers.stream().distinct().collect(Collectors.toList());

         IO.println(numbers);

        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //duplicate numbers i an array and removve them using stream APi

        int [] nums = { 1,1,1,1,12,2,2,2,2,2,2,2,3,3,3,3,34,4,44,4,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,8,9};

        nums= Arrays.stream(nums).distinct().toArray();

        IO.println(Arrays.toString(nums));
        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //skip method--> long
        List<Integer> numbers1 = new ArrayList<>();

        numbers1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbers1= numbers1.stream().skip(9).collect(Collectors.toList());

        IO.println(numbers1);
        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //limiy method---> int
        List<Integer> numbersLimit = new ArrayList<>();

        numbersLimit.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbersLimit = numbersLimit.stream().limit(1).collect(Collectors.toList());

        IO.println(numbersLimit);

        IO.println(numbers1);
        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //map method---> transform element map meethod reurn new list not arraylist
        List<Integer> numbersMap = new ArrayList<>();

        numbersMap.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbersMap = numbersMap.stream().map(a -> a*10 ).collect(Collectors.toList());

        IO.println(numbersMap);

        //even number multiple by 3 other 10

        numbersMap = numbersMap.stream().map( a-> {
            if (a % 2 == 0) {
                return a * 3;
            } else {
                return a * 10;
            }
                }
        ).collect(Collectors.toList());

        IO.println(numbersMap);


        IO.println(numbers1);
        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //filter method--->
        List<Integer> numbersFilter = new ArrayList<>();

        numbersFilter.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbersFilter = numbersFilter.stream().filter(a -> a % 2 == 0 ).map( a -> a*10).collect(Collectors.toList());

        IO.println(numbersFilter);




        IO.println(numbers1);
        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //sorted method
        List<Integer> numbersSorted = new ArrayList<>();

        numbersSorted.addAll(Arrays.asList(10, 5, 3, 4, 1, 8 ,7,2, 6, 7, 3, 9, 9,10));

        List<Integer> sortedResult  = numbersSorted.stream().sorted().collect(Collectors.toList());

        IO.println(numbersSorted);
        IO.println(sortedResult);

        IO.println(numbers1);
        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println();

        //peek method for iterate
        List<Integer> numbersPeek = new ArrayList<>();

        numbersPeek.addAll(Arrays.asList(10, 5, 3, 4, 1, 8 ,7,2, 6, 7, 3, 9, 9,10));

        List<Integer>  numbersPeekResult  = numbersSorted.stream().filter(n -> n%5==0).peek(a -> IO.println(a)).collect(Collectors.toList());

        IO.println(numbersPeek);
        IO.println(numbersPeekResult);

    }
}
