package gb.sem1.Level2.les2;

public class MyArraySizeException extends IllegalArgumentException{
    /**
     * Исключение выбрасывающееся, при неверном размере входного массива
     *
     * **/
    public MyArraySizeException(String s) {
        super(s);
    }

}
