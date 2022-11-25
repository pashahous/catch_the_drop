package mysolution.strings;

public class ByteToNumber {

    public static int byteToNum(String strOfByte) {
        /* Алгорит перевода строки из двоичного предтставления числа в десятичное
        на вход поступает строка выход число*/
        int finalNum = 0; //
        char[] charArray = strOfByte.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            finalNum+= (charArray[charArray.length - i - 1] - '0') * Math.pow(2,i);
        }
        return finalNum;
    }
}
