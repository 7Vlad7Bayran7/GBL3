package Less_3;

import java.util.Arrays;
import java.util.Objects;
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
            if (x == a) {
                System.out.printf("Угадал !%n");
                break;
            } else if (x > a) System.out.printf("число больше %n");
            if (x < a) System.out.printf("Число меньше %n");
        }
        while (q != 0);


//        2. Создать массив из слов
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
//         "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
//         "pepper", "pineapple", "pumpkin", "potato"}.
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с
//         загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает
//         буквы, которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно можно пользоваться:
//        String str = "apple";
//        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово.
//        Используем только маленькие буквы.


        Scanner myScanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String selectedWord = words[(int)Math.floor(Math.random()*words.length)];//чудо
        //System.out.println(selectedWord); //Для провкери
        System.out.println("Угадай ");
        System.out.println(Arrays.toString(words));
        String myGuess;
        StringBuilder lettersInPlace;
        do {
            System.out.print("Введи слово: ");
            myGuess = myScanner.nextLine();
            if (Objects.equals(myGuess, selectedWord)) System.out.println("Правильно!");
            else {
                lettersInPlace = new StringBuilder("###############");
                int shortestWordLenght = selectedWord.length() < myGuess.length() ? selectedWord.length() : myGuess.length();
                for (int i=0;i<shortestWordLenght;i++){
                    if (myGuess.charAt(i)== selectedWord.charAt(i)) lettersInPlace.setCharAt(i, myGuess.charAt(i));
                }
                System.out.print("Из этого угадал: ");
                System.out.println(lettersInPlace);
                System.out.println("Заново: ");
            }
        } while (!Objects.equals(myGuess, selectedWord));
    }
}

