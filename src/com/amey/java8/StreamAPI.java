package com.amey.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPI {

	public static void main(String[] args) {
				
				
				List<Integer> values =  Arrays.asList(1,2,3,4,5);
				System.out.println("----Foreach----");
				values.forEach(p -> System.out.print(p + " "));
				System.out.println();
				
				System.out.println("----doubleit----");
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
				
				//maptoint limit min max flatmap foreachOrdered comparator
				
				
				
				
	}
	private static void doubleIt(int i) {
		System.out.print(i * 2 + " ");
	}
	

}
