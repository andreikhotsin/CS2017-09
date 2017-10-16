package by.it.sc03_evening_mon_fri.khotsin.lesson03.lesson06;
/*
Рисуем долларовый прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник высотой m и шириной n из знаков $.

Пример: m=2, n=4
$$$$
$$$$

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить прямоугольник размером m на n из знаков $.
4. В программе должен использоваться цикл for.

 */

import java.util.Scanner;
class TaskA2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter m high");
        int m = keyboard.nextInt();
        System.out.println("enter  n length");
        int n = keyboard.nextInt();
        int i = 1;
        int j = 1;
        while(j <= m) {
            while (i <= n) {
                System.out.print("$");
                i++;
                if(i == n + 1){System.out.print("\n");}
            }
            i = 1;
            j++;
        }
    }
}