package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
 int [] array = {11,12,13,14,15};


 for (int i=0;i< array.length;i++)
 {
     for (int j=1; j< array.length;j++ )
     {
         if(array[i]< array[j])
         array[i]=array[i];
         else
             array[i]=array[j];
     }
 }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }


    }






}
