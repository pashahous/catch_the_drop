package gb.sem1.les3;

import java.util.Scanner;

/* Делать только одну задачу.

1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
2. * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
 "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
  "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом
и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих
местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.

Изучение гита:
https://learngitbranching.js.org/?locale=ru_RU*/
public class GameQuesTheNumber {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Игра, отгадай загаданное число==========");
        int guesNumber = (int) Math.random() * 9;
        boolean isEnd = false; // end of game of not

        System.out.println("Компьютер загадал число от 0 до 9, попробуйте отгадайте");
        while (!isEnd) {
            System.out.println("Введите число от 0 до 9");
            int answer = sc.nextInt();

            if (checkCorrectNumber(answer)){ // если введенное число корректное, то проверяем угадал ли
                if (answer == guesNumber) {
                    System.out.println(" Поздравляю вы угадали число");
                    isEnd = true;
                } else {
                    System.out.println("Вы не угадали попробуйте еще");
                }
            } else System.out.println(" Введите число в диапазоне от 0 до 9");

        }
    }

    private boolean checkCorrectNumber(int number) {
        if (!(0 <= number && number <= 9)) return false;
        else return true;

    }
}
