package gb.sem1.Level2.les2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arrStr = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},

        };
        try {

            chekArray(arrStr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static void chekArray(String[][] arr) throws MyArrayDataException,MyArraySizeException {

            Integer sumAllElements = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Входной массив неверного размера ");
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sumAllElements += Integer.parseInt(arr[i][j]);
                    } catch (Exception e) {
                        throw new MyArrayDataException("Неверный формат входных данных под индексом i= " + i + " j= " + j);
                    }
                }
            }
            System.out.println("Сумма всех числе в массиве равна = " + sumAllElements);
        }
    }
