package gb;

public class TestSpeedSortAlgoritms {

    public static void main(String[] args) {
        long end, start,sum = 0;

        start = System.nanoTime();
        for (long k = 1; k<10000000000L; k++){
            sum = sum + k;

        }
        end = System.nanoTime();
        System.out.println("Time in ms " + (end - start) + " ms" );
        System.out.printf("sum = %d  ",sum);


    }


}


