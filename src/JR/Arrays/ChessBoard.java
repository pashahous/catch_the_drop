package JR.Arrays;

public class ChessBoard {

    String[][] chessBoard;
    String letters1 = "ABCDEFGH";
    String numbs = "87654321";

    //заполняем шахматною доску
    public ChessBoard() {
        this.chessBoard = initBoard();// new String[8][8];
    }

    public String[][] initBoard() {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        return chessBoard;
    }

    public  static void soutString(char delimetr,String str){
        //Своя реализация метода join т.е. вывод букв из слова разделенных делиметром
        char [] arrayChar = str.toCharArray(); // переводим строку в массив char
        StringBuffer strBuf = new StringBuffer(arrayChar.length *2); // create variable size equal lenght * 2
        strBuf.append("  ");// add 2 whitespace
        for (char ch: arrayChar) {
            strBuf.append(ch);
            strBuf.append(delimetr);
        }
        System.out.println(strBuf);

    }
    public void printBoard() {
//        System.out.println(String.join(" ",letters1));
        ChessBoard.soutString('-',letters1); // именуем столбцы

        for (int i = 0; i < this.chessBoard.length; i++) {
            System.out.print(numbs.charAt(i) + " |"); // выводим нумерауицм строк
            for (int j = 0; j < this.chessBoard[0].length; j++) {
                System.out.print(this.chessBoard[i][j] + " ");
            }
            System.out.println();

        }

    }
}
