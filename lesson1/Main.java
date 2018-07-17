package ru.geekbrains.Java1.lesson1;
// Rozhkov Anton 16.07.2018
public class Main {
    public static void main(String[] args) {
        System.out.println("привет мир!!!");
        byte b = 125;
        System.out.println("b= " + b);

        int i;
        i = 56767856;
        System.out.println("i= " + i);

        long l = 3545656563546546L;
        System.out.println("l= " + l);

        float f = 576.5F;
        double d = 65473.3;

        boolean bool = true;
        System.out.println("bool = " + bool);
        bool = false;
        System.out.println("bool = " + bool);

        String s = "строка";
        System.out.println("s= " + s);

        char c = 'g';

        int a, v;
        a = 10;
        v = 20;
        b = 50;

        a = a + v;

        System.out.println(a);


        a += v;
        a = b + v;

        int g = a + v;

        g++;
        System.out.println(g);
        System.out.println(a);

        int j = g++ + a;
        System.out.println(j);
        System.out.println(g);

        a = 100;
        b = 50;
        if (a < b) {
            System.out.println("больше");
            System.out.println("+++");
        } else {
            System.out.println("меньше");
        }















    }
}
