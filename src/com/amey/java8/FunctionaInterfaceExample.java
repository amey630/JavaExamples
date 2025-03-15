package com.amey.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionaInterfaceExample {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> bi = (a,b) -> System.out.println(a+b);
		bi.accept(5, 7);
		
		BiFunction<Integer, Integer, String> bif = (a,b) -> "StringValue="+(a+b);
		System.out.println(bif.apply(5, 8));
		
		BinaryOperator<String> bio = (a,b)-> a+b;
		System.out.println(bio.apply("Hello", " world"));
		
		UnaryOperator<String> uo = a-> a+ " my world";
		System.out.println(uo.apply("Hello"));
		
		Predicate<String> p = s->s.contains("H");
		System.out.println(p.test("Helga"));
	}

}
