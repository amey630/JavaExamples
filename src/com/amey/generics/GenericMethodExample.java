package com.amey.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GenericMethodExample {
    static void main() {
        System.out.println("Hi");
        GenericMethodExample g = new GenericMethodExample();
        g.performSimple("First call");
        g.performSimple(10);

        g.performNumberOperationOnly(12);
//---------------------
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        System.out.println(g.performListOp(listInt, p-> p%2==0));

    }

    public <T> void performSimple(T s){
        System.out.println(s);
    }

    //Only numbers are allowed to pass
    public <T extends Number> void performNumberOperationOnly(T s){
        System.out.println(s.intValue());
    }

    public <T> Collection<T> performListOp(Collection<T> s, Predicate<T> p){

        return s.stream().filter(p).toList();


    }

}
