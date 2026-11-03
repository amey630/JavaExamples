package com.amey.generics;

public class GenericClassExample {


    static void main() {
        System.out.println("Hi");
        Box b = new Box(10);
        //        Box b = new Box("Hiiii");
        System.out.println("b.item="+b.item);
    }

}


class Box<T>{

    T item;

    public Box(T item){
        this.item = item;
    }

}
