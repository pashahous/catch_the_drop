package gb.sem1.les3;

import java.util.Scanner;

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
                    sc.close();
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
