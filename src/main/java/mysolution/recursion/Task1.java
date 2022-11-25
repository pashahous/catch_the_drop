package mysolution.recursion;

public class Task1 {
    //Посчитать сумму чисел от 1 дло n с помощью рекурсии

    public static long sumFor1ToN( int n){
        if (n == 1) return 1;
        return n + sumFor1ToN(n-1);
    }

}
