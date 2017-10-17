package by.it.sc04_evening_tue_thu.tokun.lesson06;

/*
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли типа int
3. выводит на экран максимальное, минимальное и среднее арифметическое из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку "Minimum = " минимальное число в формате int.
3. Программа должна выводить строку "Maximum = " максимальное число в формате int.
4. Программа должна выводить строку "Average = " среднее арифметическое в формате double.
 */


import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if (a>0) {
                    int min = 999999;
                    int max = 0;
                    int sum = 0;
                    for (int i = 0; i < a; i++) {
                        int temp = sc.nextInt();
                        min = min(min, temp);
                        max = max(max, temp);
                        sum = sum + temp;
                    }
                    double avg = (double) sum / a;
                    System.out.println("Minimum = " + min);
                    System.out.println("Maximum = " + max);
                    System.out.println("Average = " + avg);
                }
    }


    private static int min(int a, int b){
        return a<b?a:b;
    }

    private static int max(int a, int b){
        return a>b?a:b;
    }

}
