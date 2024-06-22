package org.example;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class solution {

   //   int a = 90;


    public static void main(String[] args) {
        System.out.println("useless");
        int [] a = new int[5];

        solution s = new solution();
    //    System.out.println(s.a);

//        for(;;)
//            System.out.println("Welcome to TZ!");

      //  System.out.println(a);

        ArrayList<Number> list=new  ArrayList<Number>() {{
            add(23);
            add(434);
            add(343.54);
            add(33.3333333332323);
        }};


        System.out.println(list);

//        ArrayList<Object> list2 = (ArrayList<Object>) list;
//        list2.add(34);
//        for(Number nm:list)
//            System.out.println(nm);

        ArrayList<String> list1=new  ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
        }};


        ArrayList<String> list2 = list1;
        list2.add("D");

        for(String fruit:list1)
            System.out.println(fruit);

        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        multi t = new multi();
//        t.start();
//
//        multi tt = new multi();
//        tt.start();
//
//        service.execute(t);
//        service.shutdown();
//        executorService.execute(new multi());
//        executorService.execute(new multi());
//        executorService.execute(new multi());
//        executorService.execute(new multi());
//        executorService.execute(new multi());
//        executorService.shutdown();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {

                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread is running brother " + a[i] + " " + Thread.currentThread().getName());

                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {

                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread is running brother " + a[i] + " " + Thread.currentThread().getName());
                    }
                }

            }
        });
        t1.start();
        t2.start();




    }
}

class multi extends Thread{


    @Override
    public void run() {



    }
}
