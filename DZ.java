package ru.geekbrains.Java1.lesson1.RozhkovAntonDZ;

//Rozhkov Anton DZ1 16/07/18


public class DZ {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");

        //  Создать переменные всех пройденных типов данных, и инициализировать их значения
        byte b = 100;
        System.out.println("b = " + b);

        int i;
        i = 56567667;
        System.out.println("i = " + i);

        long l = 3243243246546L;
        System.out.println("l = " + l);

        short sh = 2;
        System.out.println("sh = " + sh);


        float f = 376.5F;
        double d = 15473.3;

        boolean bool = true;
        System.out.println("bool = " + bool);
        bool = false;
        System.out.println("bool = " + bool);

        String s = "строка";
        System.out.println("s = " + s);

        char cr = 'A';
        System.out.println("cr = " + cr);
    }


    //  Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false

    static boolean task4 (int x1, int x2){
        int sum = x1 + x2;
        if(sum>=10 && sum <= 20) return true;
        return false;
    }


    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    static void isPositiveOrNegative(int a) {
        if (a % 2 == 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");

        }




    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
    static boolean  isNegative(int a) {
        if (a < 0) return true;
        return false;


    }
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    static void task7 (String s){
        System.out.println("Привет, " + s + "Антон!");
    }

    //Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    static void task8 (int year){
        if(year == 0){
            System.out.println("Невисокосный год");
        } else if(year%400 == 0){
            System.out.println("Високосный год");
        } else if(year%100 == 0){
            System.out.println("Невисокосный год");
        } else if(year%4 == 0){
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
}

}


