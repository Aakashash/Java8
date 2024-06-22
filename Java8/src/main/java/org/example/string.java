package org.example;

public class string {

    public static void main(String[] args) {

        String aa = "[ro.product.name]: [m21nnxx]";
        String[] str = aa.split(" ");
        String text = str[1].substring(1,str[1].length()-1);
        System.out.println(text);
    }
}
