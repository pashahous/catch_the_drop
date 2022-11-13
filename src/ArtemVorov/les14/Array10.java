package ArtemVorov.les14;

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
    static Scanner sc = new Scanner(System.in);

    public static void initialArray() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Введите число ");
//            intArray[i] = sc.nextInt();
            intArray[i] = i;
        }
        System.out.println("Массив чисел инициализирован ");
    }

    public static void printArray() {
        System.out.println("write all array of integer numbers");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }

}
