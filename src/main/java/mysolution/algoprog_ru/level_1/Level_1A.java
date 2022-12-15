package mysolution.algoprog_ru.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level_1A {
    public static void main(String[] args) {
//       System.out.println(sumOfSquear(3)); // 14
//        System.out.println(allDividers(174)); // 1 2 3 6 29 58 87 174
//        System.out.println(isZeroInSequens(4));
//        System.out.println(task4(24));
//        System.out.println(task5(174));
//        System.out.println(task6(new ArrayList<Integer>(Arrays.asList(174,175,4,5,6,176,0))));
//        System.out.println(task7(new ArrayList<Integer>(Arrays.asList(1,2,4,0))));
        System.out.println(task8(new ArrayList<Integer>(Arrays.asList(1,2,4,0))));


    }

    public static int sumOfSquear(int n) {
        // возвращает сумму квадратов чисел от 1 до n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static List allDividers(int n) {
        //Выведите все делители числа
        //N
        // в порядке возрастания.
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static String isZeroInSequens(int n) {
        //есть ли ноль во входящей последовательности
        List<Integer> listInt = new ArrayList<>();
        System.out.println("Input numbers");
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            listInt.add(scr.nextInt());
        }
        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) == 0) return "YES";
        }
        return "NO";
    }


    public static List task4(int n) {
        List<Integer> outList = new ArrayList<>();
        int numS;
        /*Выведите все значения K2 в порядке возрастания, при которых K является натуральным числом и K2 ≤N.*/
        for (int i = 1; i < n; i++) {
            numS = i * i;
            if (numS > n) return outList;
            outList.add(numS);
        }
        return outList;
    }

    public static int task5(int n) {
        /*Наименьший делитель
        Входные данные Вводится число N, большее 1.
        */
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return i;

        }
        return 0;
    }

    public static int task6(List<Integer> arr) {
        /*Дана последовательность, заканчивающаяся нулём. Выведите длину данной последовательности (сам ноль в
        последовательность не входит).
        Входные данные
        Вводится последовательность чисел, которая оканчивается нулём.*/
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) return i;

        }


        return 0;

    }

    public static int task7(List<Integer> arr) {
        /*Дана последовательность, заканчивающаяся нулём. Выведите длину данной последовательности (сам ноль в
        последовательность не входит).
        Входные данные
        Вводится последовательность чисел, которая оканчивается нулём.*/
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) return sum;
            sum += arr.get(i);

        }
        return 0;

    }

    public static int task8(List<Integer> arr) {
        /*Дана последовательность, заканчивающаяся нулём. Выведите количество четных чисел данной последовательности
        (сам ноль в последовательность не входит). Входные данные. Вводится последовательность чисел, которая
        оканчивается нулём.*/
        int countOfEven = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ( arr.get(i)%2 == 0) countOfEven+=1;
        }
        return countOfEven;
    }


}
