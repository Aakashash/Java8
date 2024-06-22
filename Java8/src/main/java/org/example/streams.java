package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenovo Laptop",2800));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));
        List<Integer> productPriceList = new ArrayList<Integer>();
        for(Product product: productsList){
            // filtering data of list
            if(product.price<30000){
                productPriceList.add(product.price);    // adding price to a productPriceList
            }
        }
        List<Integer> l = productsList.stream().filter(p -> p.price> 25000)
                .map(pm ->pm.id).collect(Collectors.toList());

        System.out.println(l);
       //   productsList.stream().filter(p -> p.price >= 30000).forEach(n-> System.out.println(n.name));
//                .map(pm -> pm.price)
//                .sorted().
 //               .collect(Collectors.toList());
       // System.out.println(count);   // displaying data

    }
}

