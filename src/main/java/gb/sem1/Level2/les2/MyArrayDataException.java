package gb.sem1.Level2.les2;

public class MyArrayDataException extends IllegalArgumentException{
    private int i,j;
    public MyArrayDataException(String s) {
        super(s);
    }

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }
}
