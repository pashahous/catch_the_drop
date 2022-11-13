package JavaSelfedu.Les10;

public class Les10 {
    public static void recurs(int n, int depth){
        System.out.println("Уровень вниз " + n);
        if (n<depth) recurs(n+1,depth);
        System.out.println("Уровень вверх " + n);

    }

}
