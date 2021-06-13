package com.amey.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
				
				
				List<Integer> values =  Arrays.asList(1,2,3,4,5,9,8,6);
				System.out.println("----Foreach----");
				values.forEach(p -> System.out.print(p + " "));
								
				System.out.println("\n----doubleit----");
				values.forEach(p -> doubleIt(p));
				values.forEach(StreamAPI::doubleIt);
				
				System.out.println();
				
				System.out.println("----Stream API----");
				Optional<Integer> o = values.stream().findFirst();
				System.out.println(o);
				System.out.println(o.get());
				
				
				System.out.println("FindAny = "+values.stream().filter(p -> p==6).findAny());
				
			
				System.out.println("orElse = "+values.stream().filter(p -> p==6).findFirst().orElse(0));
				
				System.out.println("AddAll = "+values.stream().reduce(0, (c,e)->c+e));
				System.out.println("AddAll with double = "+values.stream().map(p->p*2).reduce(0, (c,e)->c+e));
				System.out.println("AddAll even = "+values.stream().filter(p->p%2==0).reduce(0, (c,e)->c+e));
				System.out.println("Count odd = "+values.stream().filter(p->p%2!=0).count());
				System.out.println("Min = "+values.stream().min((a,b)-> a.compareTo(b)));
				System.out.println("Max = "+values.stream().max((a,b)-> a.compareTo(b)));
				System.out.print("----Limit till 4----");
				values.stream().limit(4).forEach(System.out::print);
				System.out.print("\n----Skip first 2----");
				values.stream().skip(2).forEach(System.out::print);
				
				System.out.print("\n----For each ordered(process in same order od occurence)----");
				values.stream().forEachOrdered(System.out::print);
				
				
				List<Integer> oddList = values.stream().filter(p->p%2!=0).collect(Collectors.toList());
				System.out.println("\nOdd  number list using collect-" + oddList);
				
				values.sort(( o1,  o2) -> o1.compareTo(o2));
				System.out.println("\n----sorted list----"+values);
				System.out.print("\n----Second highest number----");
				System.out.print(values.stream().skip(values.size()-2).findFirst());
				
				System.out.println("\n----maptoInt works same as map(String list divisible by 3)----");
				List<String> strList =  Arrays.asList("11","12","13","4","5","9","8","6");
				strList.stream().map(num -> Integer.parseInt(num)).filter(num -> num % 3 == 0).forEach(System.out::println);
				
				
				System.out.println("\n---FlatMap Example----");
				
				List<List<Integer>> mylist = new ArrayList<List<Integer>>();
				List<Integer> mylist1 =  Arrays.asList(1,2,3);mylist.add(mylist1);
				List<Integer> mylist2 =  Arrays.asList(4,5,6);mylist.add(mylist2);
				List<Integer> mylist3 =  Arrays.asList(7,8,9);mylist.add(mylist3);
				System.out.print("\n---Print Mylist----"+mylist);
				System.out.print("\n---Flatten Mylist----");
				mylist.stream().flatMap(x -> x.stream()).forEach(System.out::print);
				System.out.println("\n---Flatten addition of all items of flatten list-"
						+ "--"+mylist.stream().flatMap(x -> x.stream()).reduce(0, (c,e)->c+e));
			
				
				
	}
	private static void doubleIt(int i) {
		System.out.print(i * 2 + " ");
	}
	

}
