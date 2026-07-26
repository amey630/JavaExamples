package com.amey.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPITest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,12,2,11,3,4,5,6,7,8,9,10);
        list.forEach(System.out::print);

        List<Integer> list2 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(list.stream().filter(x->x%2==0).findAny());


        Map<String, String> map = new HashMap<>();
        map.put("A","1");
        map.put("B","2");
        map.put("C","3");
        map.put("D","4");


        map.forEach((x,y)-> System.out.println(x+"-"+y));

        for(Map.Entry<String, String> entry : map.entrySet()){

            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        for(String entry : map.values()){

            System.out.println(entry);
        }

        for(String entry : map.keySet()){

            System.out.println(entry);
        }

        System.out.println("-------------------------------");
        List<String> myList = Arrays.asList("amey","bharat","xavior","rahul","chandan","darpan","zampa");
        Collections.sort(myList, (x,y)-> x.compareTo(y));
        myList.forEach(System.out::println);

        System.out.println("-------------------------------");
        for(String val : myList){
           for (int i=0; i<=3; i++){
                System.out.println(val.substring(0,i));
            }
        }







    }

}
