package gb.sem1.les2;

import java.util.Arrays;

/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в
 массиве есть место, в котором сумма левой и правой части массива равны.
  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
  показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
  При каком n в какую сторону сдвиг можете выбирать сами.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(testCase(5));
        int [] arrTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Task1(new int[]{1, 1, 1, 1, 1, 1, 1, 1,});
        Task2();
        Task3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        Task4(8);
        Task5(10, 1000);
        checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        checkBalance(new int[]{1, 1, 1,2, 1});
        arrOffset(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14},-5);

    }

    public static String testCase(int num) {
        switch (num) {
            case 5:
                return "FIve";

            case 1:
                return "One";

            default:
                return "Nothibg";
        }
    }

    public static void Task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i : arr) {
            System.out.println(i);

        }

    }

    public static void Task2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    public static void Task4(int sizeOfMatrix) {
        //добавил возможность выбирать размер массива
        int[][] arrMatrix = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                if (i == j) {
                    arrMatrix[i][j] = 1;
                } else arrMatrix[i][j] = 0;
            }

        }
        for (int[] arr : arrMatrix) {
            for (int el : arr) {
                System.out.print(el + " ");
            }
            System.out.println();

        }
    }

    public static void Task5(int sizeArr, int maxValueOfArrElements) {
        int[] arrInt = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            arrInt[i] = (int) (Math.random() * maxValueOfArrElements);
        }
        int maxValue = arrInt[0];
        int minValue = arrInt[1];
        System.out.println("Arrays:----------- \n " + Arrays.toString(arrInt));
        for (int i = 0; i < arrInt.length; i++) {
            // for find max
            if (arrInt[i] > maxValue) maxValue = arrInt[i];
            // for find min
            if (arrInt[i] < minValue) minValue = arrInt[i];
        }
        System.out.printf("Max value = %d  Min value = %d ", maxValue, minValue);
    }

    public static boolean checkBalance(int[] inputArr) {
        //2, 2, 2, 1, 2, 2,10, 1
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < inputArr.length; i++) {
            sumLeft += inputArr[i];
            for (int j = i + 1; j < inputArr.length; j++) {
                sumRight += inputArr[j];
                if (sumLeft < sumRight) {
                    // проверяем, если сумма слева уже меньше чем сумма справа, и цикл еще
                    // не завершен, то обнуляем сумму правой части и завершаем текущий цикл.
                    sumRight = 0;
                    break;
                }
            }
            if (sumLeft == sumRight) {
                System.out.printf("True Index of balanse between : %d   ", i);
                return true;
            }
            sumRight = 0;// обнуляем

        }
        System.out.println("False");
        return false;
    }
    public static void arrOffset(int [] arr,int numOffset){
        if(numOffset<0){
                for(int k = 0;k>numOffset; k--) {
                    int temp = arr[0];
                    for (int i = 0; i < arr.length-1; i++) {
                        arr[i] = arr[i+1];
                    }
                    arr[arr.length - 1] = temp;

            }
            System.out.println(Arrays.toString(arr));
        } else {
            for(int k = 0;k<numOffset; k++) {
                int temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
                System.out.println(Arrays.toString(arr));
            }


    }
}
