package gb.sem1.les4;

import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'x';
    public static final char DOT_Y = 'o';
    public static char[][] map;
    public static final int SIZE = 3;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public void run() { //основной цикл игры
        initMap();
        while (true) { // основной цикл

            printMap();
            turnHuman();
            if (isWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            printMap();
            turnAi();
            if (isWin(DOT_Y)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ночья");
                break;
            }

        }
        System.out.println(" Game over");
    }

    private void turnAi() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_Y;
    }


    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    private static boolean isWin(char symb) {
        int symbCount = 0;
        for (int i = 0; i < SIZE; i++) { // столбцы
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb)
                    symbCount += 1;
            }
            if (symbCount == 3) return true;
            symbCount = 0;
        }
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) { // строки

                if (map[i][j] == symb)
                    symbCount += 1;
            }
            if (symbCount == 3) return true;
            symbCount = 0;// обнуляем счетчик
        }

        for (int j = 0; j < SIZE; j++) {//  диагональ
            for (int i = 0; i < SIZE; i++) {
                if (i == j && map[i][j] == symb)
                    symbCount += 1;
            }
            if (symbCount == 3) return true;
            symbCount = 0;// обнуляем счетчик
        }

        for (int j = SIZE - 1; j > 0; j--) {
            for (int i = SIZE - 1; i > 0; i--) { // диагональ

                if (i == j && map[i][j] == symb)
                    symbCount += 1;
            }
            if (symbCount == 3) return true;
            symbCount = 0;// обнуляем счетчик
        }

        return false;
    }

    private static void turnHuman() {
        int x, y;
        do {
            System.out.println("Введите координаты хода");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
        System.out.printf("Человек походил походил в точку x = %d  y = %d \n", x, y);
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }

        }
        return true;
    }
}