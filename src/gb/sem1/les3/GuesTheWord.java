package gb.sem1.les3;

import java.util.Scanner;

public class GuesTheWord {
    private final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};

    public void run() {
        int indexQuesWord = (int) (Math.random() * (words.length - 1));
        String quesWord = words[indexQuesWord]; // загаданное слово
        System.out.println(quesWord);
        boolean isEnd = false;//
        StringBuffer prompt = new StringBuffer(); // подсказка

        Scanner sc = new Scanner(System.in);

        while (!isEnd) {
            System.out.println(" Компьютер загадал слово, попробуйте отгадать его, а я буду делать подсказки показывая" +
                    " букву которые стоят на своих местах");
            System.out.println("Введите слово");
            String answer = sc.nextLine();
            int minLenght = checkMinLenght(answer.length(), quesWord.length());
            if (answer.equals(quesWord)) {
                System.out.println(" Вы угадали слово");
                break;
            }

            for (int i = 0; i < minLenght; i++) {
                if (answer.charAt(i) == quesWord.charAt(i)) {
                    prompt.append(answer.charAt(i));
                }else{
                    prompt.append("#");
                }
            }
            prompt.append("########");// что бы не было понятно из скольки символов состоит загаданное слово
            System.out.println("Вы не угадали слово, но есть подсказка");
            System.out.println("Подсказка: "+ prompt);
            prompt.setLength(0); // обнуляем подсказку


        }


    }

    private int checkMinLenght(int a, int b) { // check min lenght
        return Math.min(a, b);
    }

}
