package com.ezzedini;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args){
        Queue<Person> supermarket= new LinkedList<>();

        supermarket.add(new Person("Yassine", 25));
        supermarket.add(new Person("Majdi", 40));
        supermarket.add(new Person("Adem", 21));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){}
}
