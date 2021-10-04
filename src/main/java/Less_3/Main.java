package Less_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать
        // это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем
        // загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 –
        // нет»(1 – повторить, 0 – нет).
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int x = rd.nextInt(10);
        int q = 3; // попыток
        do {
            System.out.printf("Угадай число от 0 до 9. Попыток %s%n Введите число: ", q);
            int a = sc.nextInt();
            q--;
            if(x==a){
                System.out.printf("Угадал !%n");
                break;
            }
            else
            if (x>a) System.out.printf("число больше %n");
            if (x<a) System.out.printf("Число меньше %n");
        }
        while (q != 0);
    }
}