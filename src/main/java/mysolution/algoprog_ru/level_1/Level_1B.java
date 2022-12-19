package mysolution.algoprog_ru.level_1;

import java.util.*;

public class Level_1B {
    public static void main(String[] args) {
//        System.out.println(task3(6));
//        System.out.println(task4(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7))));
//        System.out.println(task5(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7))));
        /*
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        arr.add(new ArrayList<Integer>(Arrays.asList(2,4,5,5)));
        arr.add(new ArrayList<Integer>(Arrays.asList(3,5,6,6)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4,5,6,7)));
        System.out.println(task6(arr));
        */
//        task7();
//        task8(10, 10); // треугольник поскаля
//        System.out.println(taskString4("Are you watching this test now"));
//        System.out.println(isPalindrom("kakak"));
//        System.out.println(isPalindrom("kaaka"));
//        System.out.println(angleOfHour(3,2,6));
//        System.out.println(numberOfDay(10,50));
//        System.out.println(numberOfDaySum(10, 70));
//        System.out.println( eatDog(true));
        System.out.println(divToFactorial(3));

    }

    public static int task3(int n) {
        /*Больше предыдущего
        Входные данные Вводится число N . Дальше вводится массив целых чисел из N элементов.
        Выходные данные
        Выведите количество элементов, которые больше предыдущего.*/
        List<Integer> arr = new ArrayList<>();
        int count = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < n; i++) {
            arr.add(scr.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) count += 1;
        }
        return count;
    }

    public static ArrayList<Integer> task4(ArrayList<Integer> arr) {
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
        for (int i = 0; i < arr.size() / 2; i++) {
            temp = arr.get(i);
            arr.set(i, arr.get(arrSize - 1 - i));
            arr.set(arrSize - 1 - i, temp);

        }

        return arr;
    }

    public static ArrayList<Integer> task5(ArrayList<Integer> arr) {
        /*Циклически вправо
Вводится число N . Дальше вводится массив целых чисел из N  элементов.
Выходные данные
Сдвиньте элементы массива вправо на один элемент, то есть, нулевой элемент становится первым, первый становится вторым,
 ..., последний становится нулевым Надо не просто ввести или вывести числа хитрым образом — надо реально в массиве
 их переставить как требуется;  1 2 3 4 5
                                1 1 2 3 4                */
        Integer temp;
        Integer arrSize = arr.size();
        temp = arr.get(arrSize - 1);
        for (int i = arrSize - 1; i > 0; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(0, temp);
        return arr;
    }

    public static String task6(ArrayList<ArrayList<Integer>> arr) {
        /*Симметрия матрицы Вводится число N. Дальше вводится матрица целых чисел из N строк и N столбцов.
Выходные данные Определите, симметричная ли данная матрица относительно главной диагонали (главной диагональю является
диагональ, проходящая из верхнего левого угла в правых нижний).
Если матрица симметричная, выведите yes, иначе выведите no. */
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if (i == j) continue;
                ;
                if (arr.get(i).get(j) != arr.get(j).get(i)) return "no";
            }
        }
        return "yes";
    }

    public static void task7() {
        /*Вводятся числа N и M. Далее вводится матрица неотрицательных чисел из N строк и M столбцов.
Выходные данные
Выведите сначала значение максимального элемента в матрице, затем номер строки и столбца, где он находится.
Если в массиве несколько максимальных элементов, то нужно вывести минимальный номер строки, в которой встречается
максимальный элемент, а если в этой строке максимальных элементов несколько, то нужно вывести минимальный номер
столбца.*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Input size of matrix");
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] arr = new int[n][m];
        int maxEl = 0;
        int curI = 0, curJ = 0;
        System.out.println("Input all values of N*M matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("index " + i + ":" + j);
                arr[i][j] = scr.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == maxEl) continue;
                if (arr[i][j] > maxEl) {
                    curI = i;
                    curJ = j;
                    maxEl = arr[i][j];
                }
            }

        }
        System.out.println(maxEl + "\n" + curI + " " + curJ);
    }

    public static void task8(int n, int m) {
        /*P[i][0] = 1;
        P[0][j] = 1;
        P[i][j] = P[i - 1][j] + P[i][j - 1].
        Входные данные
        Вводятся 2 натуральных числа N и M.
        Выходные данные
        Выведите матрицу из N строк и M столбцов, заполненную по правилу в условии задачи.*/
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            arr[0][j] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int taskString4(String str) {
        //возвращает количество слов разделенных пробелом
        int countWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') countWords += 1;
        }
        return countWords + 1;
    }

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }

    public static Float angleOfHour(Integer hour, Integer minute, Integer second) {
        //вычислить угол часовой стрелки если с начала дня прошло  H  M  S времени
        Float oneHourGradus = (float) 360 / 12; //30
        Float oneMinuteGradus = (float) 30 / 60; //0.5
        Float oneSecondGradus = (float) 0.5 / 60; // 0.0083

        return hour * oneHourGradus + minute * oneMinuteGradus + second * oneSecondGradus;
    }

    public static float numberOfDay(float currentDistance, float y) {
        /*В первый день Женя пробежал x километров, а в каждый следующий день пробегал на 70% больше, чем в предыдущий.
         Определите номер дня, в который Женя пробежит не менее y километров.*/
        final float koefOfDist = 0.7f;
        int currendDay = 1;
        while (currentDistance <= y) {
            currentDistance = currentDistance + currentDistance * koefOfDist;
            currendDay += 1;
//            if(currentDistance > y){
//                break;
//            }
        }
        return currendDay;
    }

    public static int numberOfDaySum(float currentDistance, float y) {
        /*В первый день Женя пробежал x километров, а в каждый следующий день пробегал на 70% больше, чем в предыдущий.
        Определите номер дня, в который Женя пробежит не менее
y километров в сумме за все дни.
Входные данные
Вводятся два действительных положительных числа x и y. Числа заданы с
точностью до 6 знаков после запятой. В некоторых тестах числа вводятся в одной строчке, а в некоторых - в двух!*/
        float sumDistwithAllDays = 0;
        final float koefOfDist = 0.7f;
        int curDay = 1;
        while (sumDistwithAllDays < y) {
            currentDistance = currentDistance + currentDistance * koefOfDist;
            sumDistwithAllDays = sumDistwithAllDays + currentDistance;
            curDay += 1;
        }
        return curDay;
    }

    public static String eatDog(boolean coments) {
        float x;
        float y;
        float z;

        float a = 0;
        float b = 0;
        float c = 0;
        Scanner scr = new Scanner(System.in);
        if (coments) {
            System.out.println("Введите норму X Y Z через пробел ");
        }
        String inStr = scr.nextLine();
        String[] result = inStr.split(" ");
        x = Float.parseFloat(result[0]);
        y = Float.parseFloat(result[0]);
        z = Float.parseFloat(result[0]);
        if (coments) {
            System.out.println("Введите количество продуктов которые получила собака ");
        }
        int nProduct = scr.nextInt();
        if (coments) {
            System.out.println("Теперь введите калорийность продуктов и их количество через пробел A B C and Q");
        }
        int count = 0;
        scr.nextLine();
        while (count < nProduct) {
            System.out.println(" ПРОДУКТ № " + count);
            inStr = scr.nextLine();
            result = inStr.split(" ");
            System.out.println(inStr + " " + inStr.length());
            if (result.length != 4) continue;
            count++;
            result = inStr.split(" ");
            float q = Float.parseFloat(result[3]);// количество  единиц продукта данного типа
            a += Float.parseFloat(result[0]) * q;
            b += Float.parseFloat(result[1]) * q;
            c += Float.parseFloat(result[2]) * q;
        }
        return (x <= a && y <= b && z <= c) ? "yes" : "no";
    }

    public static int factor(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static Double divToFactorial(double n) {
        Double returnNum = 1.0;
        for (int i = 1; i <= n; i++) {
            returnNum +=  (float)1/factor(i);;
        }
        return returnNum;
    }


}


