package mysolution.algoprog_ru.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level_1B {
    public static void main(String[] args) {
//        System.out.println(task3(6));
//        System.out.println(task4(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7))));
        System.out.println(task5(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7))));
    }

    public static int task3(int n) {
        /*Больше предыдущего
        Входные данные Вводится число N . Дальше вводится массив целых чисел из N элементов.
        Выходные данные
        Выведите количество элементов, которые больше предыдущего.*/
        List<Integer> arr = new ArrayList<>();
        int count= 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < n; i++) {
            arr.add(scr.nextInt());
        }
        for (int i = 0; i < n-1;i++) {
            if(arr.get(i) < arr.get(i+1)) count+=1;
        }
        return count;
    }
    public static ArrayList<Integer> task4(ArrayList<Integer> arr){
        /*
Вводится число N
. Дальше вводится массив целых чисел из N
 элементов.
Переставьте элементы массива в обратном порядке
Надо не просто ввести или вывести числа хитрым образом — надо реально в массиве их переставить как требуется;
при этом нельзя использовать дополнительные массивы, срезы (в питоне) и пользоваться стандартными операциями типа
insert или reverse.
        * */
        Integer temp;
        Integer arrSize = arr.size();
        for (int i = 0; i <arr.size()/2 ; i++) {
             temp = arr.get(i);
             arr.set(i,arr.get(arrSize-1-i));
             arr.set(arrSize-1-i,temp);

        }

        return arr;
    }
    public static ArrayList<Integer> task5(ArrayList<Integer> arr){
        /*Циклически вправо
Вводится число N . Дальше вводится массив целых чисел из N  элементов.
Выходные данные
Сдвиньте элементы массива вправо на один элемент, то есть, нулевой элемент становится первым, первый становится вторым,
 ..., последний становится нулевым Надо не просто ввести или вывести числа хитрым образом — надо реально в массиве
 их переставить как требуется;  1 2 3 4 5
                                1 1 2 3 4                */
        Integer temp;
        Integer arrSize = arr.size();
        temp = arr.get(arrSize-1);
        for (int i = arrSize-1; i > 0; i--) {
            arr.set(i,arr.get(i-1));
        }
        arr.set(0,temp);
        return arr;
    }

}
