package main.java.mysolution.habrtasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,

 с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем
 значение «3».*/
public class GenElementWithWeight {
    private int[] finalArray;

    public GenElementWithWeight(int[] arrayValue, int[] arrayWeight) {
        int sum = 0;
        // сумируем все веса, что бы понимать размер финального массива для заполнения его значениями
        for (int i = 0; i < arrayWeight.length; i++) {
            sum += arrayWeight[i];
        }
        finalArray = new int[sum];// создаем массив целых чисел
        int count = 0;
        for (int i = 0; i < arrayValue.length; i++) {// проходимся по всем значениям
            for (int j = 0; j < arrayWeight[i]; j++) {// добавляем значение в массив стоько раз, каков его вес
                finalArray[count] = arrayValue[i];
                count++;
            }
        }
    }
    public int getElement() {
        Random rnd = new Random();
        return finalArray[rnd.nextInt(finalArray.length)];
    }
}
