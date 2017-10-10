package by.it.sc03_evening_mon_fri.khotsin.lesson03.lesson05;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;


class TaskA2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a  integer number of week");
        int a;
        do {
            a = keyboard.nextInt();
            switch (a) {
                case 1:
                    println("Понедельник");
                    break;
                case 2:
                    println("Вторник");
                    break;
                case 3:
                    println("Среда");
                    break;
                case 4:
                    println("Четверг");
                    break;
                case 5:
                    println("Пятница");
                    break;
                case 6:
                    println("Суббота");
                    break;
                case 7:
                    println("Понедельник");
                    break;
                default:
                    println("Такого дня недели не существует");


           }
        } while (keyboard.hasNext());



    }

}

