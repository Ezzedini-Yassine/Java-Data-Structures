package com.ezzedini;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args){
        //List is an interface that is implemented in ArrayList
        //when working with lists, just declare list on the left
        //and choose whatever implementation of it on the right
        //ArrayList is what we are using 90% of the time, cause
        //memory these days is not a concern. Need more resources ?
        //spin up more machines on the cloud

        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );//immutable list

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        //3 ways to loop through list

        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
