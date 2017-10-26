package by.it.sc03_evening_mon_fri.khotsin.lesson03;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter two integer number");
        int mysum = keyboard.nextInt();
        int mysumm = keyboard.nextInt();

        System.out.println("Sum = " + (mysum + mysumm));
    }

}
