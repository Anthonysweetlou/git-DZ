package ru.geekbrains.Java1.lesson1;

public class Prime {
    public static void main(String[] args) {
        int u = 10, g =50;
        int i = 30, o = 453;


        int sum1 = u + g;
        System.out.println(sum1);

        int sum2 = add(u, g);
        System.out.println(sum2);

        int sum3 = add(4,  9);
        System.out.println(sum3);

        addPrint(7,9);




    }
    public static int add (int a, int b){
        int d = a + b;
        return d;


    }
    public static void addPrint(int a, int b) {
        int d = a + b;
        System.out.println(d);

    }
}


