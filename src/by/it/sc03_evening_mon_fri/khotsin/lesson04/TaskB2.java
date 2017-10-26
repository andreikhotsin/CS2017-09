package by.it.sc03_evening_mon_fri.khotsin.lesson04;

import java.util.Scanner;


class TaskB2 {
    public static double dis(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int a = cr.nextInt();
        int b = cr.nextInt();
        int c = cr.nextInt();
        double dis = dis(a, b, c);
        if (dis > 0)
            System.out.println((-b + Math.sqrt(dis)) / (2 * a) + " " + (-b - Math.sqrt(dis)) / (2 * a));
        if (dis == 0)
            System.out.println((-b + Math.sqrt(dis)) / (2 * a));
        if (dis < 0)
            System.out.println("Отрицательный дискриминант");
    }

}
