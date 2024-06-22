package org.example;

public class lambda {

    interface obj{
       public String s(String name);

    }

    interface obj1{
        public void s();
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        final int a=33;

        obj t = (name) -> {
            return "Hello " + name;
        };

        obj1 t1 = () ->{
            System.out.println("understandable");
            //int a;
           // a =10;
            System.out.println(a);
        };

        System.out.println(t.s("Confused"));
        t1.s();
        System.out.println();
    }
}
