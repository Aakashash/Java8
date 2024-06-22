package org.example;

import java.util.Arrays;

public class dups {
    public static void removeDuplicates(int a[], int n)
    {
        int j = 0;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 44, 55, 4, 1, 1, 1, 1, 1, 31, 22, 1};

        String[] as = new String[12];
        int value = 0;
        int count = 0;
        int com = 1;
        for (int i = 0; i < a.length; i++) {
            com = 1;
            for (int j = 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    com++;
                    value = a[i];
                }
            }
            if (com > count) {
                count = com;
            }
        }
        System.out.println(count + " and the value is " + value);
        int array[] = {1,2,1,56,33,2,34,3,4,5,6,4,4,5,5,1,2,3,4,5};
        int n = array.length;
        removeDuplicates(array, n);

    }
}
