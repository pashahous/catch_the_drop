package java_basic_itcot;
/*
1) Создать метод sum, который должен суммировать 2 числа.
2) Создать метод multy, который должен умножить 2 числа.
3) Создать метод subt, который должен вычесть второе число из первого.
4) Создать метод div, который должен делить 2 числа.
*/
/*
1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/

public class Hw5 {

    private int n,k;
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double multy(double a, double b) {
        return a * b;
    }

    public static double subt(double a, double b) {
        return b - a;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double convert(double dollarsAmount, double cursEvroForOneDollar) {
        return dollarsAmount * cursEvroForOneDollar;

    }

    public static double percent(double num) {
        return num + (double) (num * 0.1);
    }

    public static void print(String str, int numOFPrint) {
        for (int i = 0; i < numOFPrint; i++) {
            System.out.println(str);
        }
    }


    public void hw5() {
        double a = 10.4f;
        double b = 20.5f;
        System.out.printf("Sum of two numbers %f + %f = %f \n", a, b, sum(10, 20));
        System.out.printf("Multy of two numbers %f * %f = %f \n", a, b, multy(a, b));
        System.out.printf("subt of two numbers %f - %f = %f \n", a, b, subt(a, b));
        System.out.printf("div of two numbers %f / %f = %f\n", a, b, div(a, b));
        double c = 10;
        double d = 2.5f;
        System.out.printf("COnvert Dollars = %f to Evro with cours 1$ = f% evro  = % EVRO \n", c, d, convert(c, d));
        System.out.println("10% at 10 = " + percent(10));
        print("Hello Dimon Chrebtov", 10);


    }


}
