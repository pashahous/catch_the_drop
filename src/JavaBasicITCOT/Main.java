package JavaBasicITCOT;


import java.util.Random;

public class Main {
    public static void main(String[] args){
//        Hw5 hw = new Hw5();
//        hw.hw5();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(rnd.nextInt(3));

        }
    }
}
