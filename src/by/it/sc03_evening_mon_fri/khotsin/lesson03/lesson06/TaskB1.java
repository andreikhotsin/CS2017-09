package by.it.sc03_evening_mon_fri.khotsin.lesson03.lesson06;
/*
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно тоже учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
*/


import java.util.Scanner;
class TaskB1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter  three numbers");
        int a;
        int b;
        int c;
        int sum;

        do {
            a = keyboard.nextInt();
            b = keyboard.nextInt();
            c = keyboard.nextInt();
            System.out.println(a + " " + b + " " + c);
            sum = a+b+c;
            System.out.println("sum=" + sum);
        }
        while (a!=-1);
         }

}
