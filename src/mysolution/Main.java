package mysolution;

import mysolution.Strings.ByteToNumber;
import mysolution.recursion.Task1;


public class Main {
    public static void main(String[] args) {
//        int n = ByteToNumber.byteToNum("11110001");
//        System.out.println(n);
        long m = System.currentTimeMillis();
        System.out.println(Task1.sumFor1ToN(6));
        System.out.println((double) (System.currentTimeMillis() - m));



    }
}
