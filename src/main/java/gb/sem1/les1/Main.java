package gb.sem1.les1;


/*1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.

4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
 (включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
 сообщение «Привет, указанное_имя!».
8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Task3(2, 3, 5, 6.5f));
        System.out.println(Task4(10, 15));
        System.out.println(Task5(10));
        System.out.println(Task6(-10));
        System.out.println(Task7("Dimooon"));
        System.out.println(Task8IsHighYear(1900));
        System.out.println(Task8IsHighYear(1992));

    }

    private static void Task2() {
        byte b = 5; //2**8 -128:127
        short s = 1534;//2**16 -32768:32767
        int i = 12345; //2**32 -2147483648 2147483647
        long l = 1234L;// 2**64  - занимает 8 байт
        float f = 123.09f;//2**32 с плавающей точкой
        double d = 123;// 2**64 с плавающей точкой

    }

    private static float Task3(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    private static boolean Task4(float a, float b) {
        float res = a + b;
        if (10 <= res && res <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static String Task5(int a) {
        if (a >= 0) {
            return "Number is positive +";
        } else return "Number is negative - ";

    }

    private static boolean Task6(int a) {
        return a < 0;
    }

    private static String Task7(String name) {
        return "Привет " + name;

    }

    private static boolean Task8IsHighYear(int year) {
        //4,100,400
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}


