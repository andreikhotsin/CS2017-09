package by.it.sc03_evening_mon_fri.khotsin.lesson03.lesson06;
/*
Треугольник из $
Прочитать переменную size с клавиатуры

Используя цикл for вывести на экран
прямоугольный треугольник из букв алфавита (ENGLISH), начиная с буквы A со сторонами size * size.

Пример
Ввод: 10
Вывод:
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH
ABCDEFGHI
ABCDEFGHIJ
*/

import java.util.Scanner;
class TaskA3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter size");
        int size = keyboard.nextInt();
        int i = 1;
        int j = 1;
        char ch;
        ch = 'A';
        while(j <= size) {
           while (i <= j) {
                System.out.print(ch);
                i++;
                ch++;
                if( i > j ){System.out.print("\n");}
            }
            i = 1;
            ch = 'A';
            j++;
        }
    }
}