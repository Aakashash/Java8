package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        items i = new items(10, "keyboard","electronics");
        items i1 = new items(20, "mouse","electronics");
        items i2 = new items(30, "chair","furniture");
        items i3 = new items(40, "table","furniture");

        ArrayList <items> list = new ArrayList<items>();

        list.add(i);
        list.add(i1);
        list.add(i2);
        list.add(i3);

        int electronics_quantity=0;

        Map <String,Integer> map = new HashMap<String, Integer>();

        for (int j = 0; j < list.size(); j++) {
            items obj = list.get(j);
            if(map.containsKey(obj.getCategory()))
            {
                int a = map.get(obj.getCategory());
                map.put(obj.getCategory(), a+obj.getQuantity());
            }
                else
            map.put(obj.getCategory(),obj.getQuantity());

                    }

        for (Map.Entry<String, Integer> str : map.entrySet())
        {
            System.out.println(str.getKey() +" "+ str.getValue());

        }


    }
}