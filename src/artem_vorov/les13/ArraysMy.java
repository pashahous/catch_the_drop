package artem_vorov.les13;

import java.util.Scanner;

public class ArraysMy {
    public static int[] arr1 = new int[10];
    public static int[] arr2 = new int[10];
    public static int[] arr3 = new int[10];
    public static String[] arrStr1 = new String[10];

    public static void testArrays1() {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void testArrays2() {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2.length - i;
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        /* Создать и заполнить массив из 10 чисел, значениями от 10 до 19 */
        System.out.println();
    }


    public static void testArrays3 () {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 10 + i;
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }


    public static void arrStr1 () {
        /* Ввести 5 строк с клавиатуры и записать их в массив */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5 строк");
    for (int i = 0; i < 5; i++) {
        System.out.println("Строка "+ i);
            arrStr1[i] = in.next();
        }
        for (String str : arrStr1) {
            if (str == null) break;
            System.out.print(str + " ");
        }
    }

    public static  void minElement(){
        int [] arrNum =  new int[]{1,3,5,7,9,13,45,67,89,23,-2,-56};
        Integer [] arrNum1 =  new Integer[]{1,3,5,7,9,13,45,67,89,23,-2,-56};
        int minNum = arrNum[0];
        for(int i=1; i<arrNum.length; i++){
            if ( arrNum[i] < minNum){ minNum = arrNum[i];}
        }

        System.out.println("Наименьшее число = " + minNum);
    }

    public  static void squearEight(){
        int [][] arr6 = new int [10][8];
        System.out.println();
        for (int i = 0; i < arr6.length ; i++) { //заполняем массив 8ками
            for (int j = 0; j <arr6[0].length ; j++) {
                arr6[i][j] = j + i*arr6[0].length;
            }
        }
        for (int i = 0; i < arr6.length ; i++) { //заполняем массив 8ками
            for (int j = 0; j < arr6[0].length; j++) {
                System.out.print(arr6[i][j]+" ");
            }
            System.out.println();
        }

    }
}