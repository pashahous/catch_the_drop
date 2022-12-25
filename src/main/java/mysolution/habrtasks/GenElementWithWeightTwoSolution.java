package main.java.mysolution.habrtasks;

import java.util.Arrays;

/*Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,

 с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем
 значение «3».*/
public class GenElementWithWeightTwoSolution {
    private int[] arrayValue;
    private int[] arrayWeight;
    private int[] ranges;
    private int sum = 0;

    // |-|--|-------
    public GenElementWithWeightTwoSolution(int[] arrayValue, int[] arrayWeight) {
        this.arrayValue = arrayValue;
        this.arrayWeight = arrayWeight;
        ranges = new int[arrayValue.length];
        // создать дополнительный массив размера значений, и заполнить его суммой весов
        for (int weight : arrayWeight) { //считаем общую сумму весов
            sum += weight;
        }
        int weightSum = 0;

        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = weightSum;
            weightSum += arrayWeight[i];
        }
        System.out.println(Arrays.toString(ranges));
    }

    public int getRandomNum() {
        int rand = (int) (Math.random() * sum - 1);
        int ourRangeIndex = 0;
        for (int i = 0; i < arrayValue.length; i++) {
            if (ranges[i] > rand) {
                break;
            }
            ourRangeIndex = i;
        }
        return arrayValue[ourRangeIndex];


    }
}
