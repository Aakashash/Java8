package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {

    public static void main(String[] args) {

        List<Product> productsList1 = new ArrayList<Product>();
        //Adding Products
        productsList1.add(new Product(1,"HP Laptop",25000));
        productsList1.add(new Product(2,"Dell Laptop",30000));
        productsList1.add(new Product(3,"Lenovo Laptop",2800));
        productsList1.add(new Product(4,"Sony Laptop",28000));
        productsList1.add(new Product(5,"Apple Laptop",90000));

        List<Product> productsList2 = new ArrayList<Product>();
        //Adding Products
        productsList2.add(new Product(1,"Samsung",69000));
        productsList2.add(new Product(2,"Iphone",130000));
        productsList2.add(new Product(3,"Mi",22700));
        productsList2.add(new Product(4,"Xperia",28000));
        productsList2.add(new Product(5,"Motorola",9000));

        List<Product> productsList3 = new ArrayList<Product>();
        //Adding Products
        productsList3.add(new Product(1,"Loreal",25000));
        productsList3.add(new Product(2,"Clinic Plus",30000));
        productsList3.add(new Product(3,"Head & shoulders",2800));
        productsList3.add(new Product(4,"Meera",28000));
        productsList3.add(new Product(5,"Biotic",90000));

        List<List<Product>>  list = new ArrayList<>();
        list.add(productsList1);
        list.add(productsList2);
        list.add(productsList3);

        List<String> result = list.stream().flatMap(products -> products.stream())
                .map(p -> p.name).collect(Collectors.toList());
        System.out.println(result);


    }
}
