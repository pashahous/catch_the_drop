package artem_vorov.les14;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/

import java.util.Scanner;

public class Array10 {
    static int[] intArray = new int[10];
    static int[] firstArr = new int[5];
    static int[] secondArr = new int[5];
    static Scanner sc = new Scanner(System.in);

    public static void initialArray() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число ");
            intArray[i] = sc.nextInt();
//            intArray[i] = i;
        }
        int lenghtArr1 = firstArr.length;
        int lenghtArr2 = secondArr.length;
        System.out.println("Массив чисел инициализирован ");
        for (int i = 0; i < intArray.length;i++) {
            //кроче находку придумал условие, что бы пройтисьв одном цыкле, и присвоить значения одного массива в значения другого
            // посредством проверки в условиях
            if (i < lenghtArr1){
                firstArr[i] = intArray[i];
            } else {
                secondArr[i-lenghtArr1] = intArray[i];
            }
        }
        for ( int num:secondArr){
            System.out.println(num);
        }
    }

    public static void printArray() {// реализовал тестовый метод для вывода всех значений из массива
        System.out.println("write all array of integer numbers");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }

}
