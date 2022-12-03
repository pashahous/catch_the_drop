package mysolution;

import mysolution.recursion.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
//        int n = ByteToNumber.byteToNum("11110001");
//        System.out.println(n);
        Map<String, String[]> dictOfValues = new HashMap<>();
    printBinary(90);

         //0 - имена
            //1 - прилагательные
            //2 - существительные
//        System.out.println(str[0]);
//        long m = System.currentTimeMillis();
//        System.out.println(Task1.sumFor1ToN(6));
//        System.out.println((double) (System.currentTimeMillis() - m));
//        System.out.println(GenForClass.getNameOfBook("nps"));
    }
    public static void printBinary(int x) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
        while (sb.length() < 32){
            sb.insert(0,"0");
        }
        System.out.printf("8%d = %s\n",x,sb);
    }
}
