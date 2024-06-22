package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class filtermap {

    public static void main(String[] args) {
        items i = new items(10, "keyboard","electronics");
        items i1 = new items(20, "mouse","electronics");
        items i2 = new items(30, "chair","furniture");
        items i3 = new items(40, "table","furniture");

        ArrayList<items> list = new ArrayList<items>();

        list.add(i);
        list.add(i1);
        list.add(i2);
        list.add(i3);

        //System.out.println(list);

        //list.stream().filter(p->p.getQuantity()>20).forEach(n-> System.out.println(n));
        Map< Integer,String> map = list.stream()
                .collect(Collectors.toMap(p->p.getQuantity(),  p->p.getCategory()));

       // System.out.println(map);

        // learning of Map
        Map<String, Integer> m = new HashMap<>();

        m.put("Ram",12);
        m.put("Ramest",11);
        m.put("Rahul",13);
        m.put("Rajesh",14);
        m.put("Ravindra",15);
        m.put("Raj",16);

        System.out.println(m);
        int q = m.get("Rahul");
        System.out.println(q);

        for (Map.Entry str: m.entrySet()) {
            System.out.println(str.getKey()+" " +str.getValue());

        }


    }
}
