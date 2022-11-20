package java_selfedu.Less7;

public class Arrays {
    float b = 2.0f;
    float k = 0.56f;
    float y[] = new float[200];

    public void calculateFuncY() {
        for (int x = 0; x < y.length; x++) {
            y[x] = k * x + b;// fill array values
        }

        for (int x = 0; x < y.length; x++) {
            System.out.print(" X = " + x + " Y = " + y[x]);
            if (x % 4 == 0 && x != 0) {
                System.out.println(" ");
            }
        }
    }

    public void zybchatuArray(int lenOfArray, boolean randomZybu) { //реализация зубчатого массива.
        int z_array[][] = new int[lenOfArray][]; //инициализируем размер зубчатого массиваст
        int count = 0; // счетчик для заполнения массива числами
        for (int a = 0; a < lenOfArray; a++) {
            if (randomZybu) { // слуxайные размеры зубов
                int b = (int) (Math.random() * lenOfArray);
                z_array[a] = new int[b];
                //сразу заполняем массив
                for (int i = 0; i < z_array[a].length; i++) {
                    z_array[a][i] = count;
                    count++;
                }
            }
        }
        for (int z = 0; z < z_array.length; z++) {
            for (int value : z_array[z]) {
                System.out.print(value + " ");
            }
            System.out.print("\n");
        }

    }

    public void bubleSort(int size_array, boolean revers) {
        int[] arrayForSort = new int[size_array];
        for (int i = 0; i < size_array; i++) {
            arrayForSort[i] = (int) (Math.random() * size_array); //заполняем массив случайными числами
        }
//        int [] arrayForSort = {9,8,7,6,5,4,3,2,1};
        System.out.println("Перед сортировкой");
        for (int val : arrayForSort) {
            System.out.print(" " + val);
        }
        System.out.println(" ");
        // сортируем массив
        for (int i = 0; i < arrayForSort.length - 1; i++) {
            int min = arrayForSort[i]; // запоминаем первый элемент массива
            int pos = i;// запоминаем позицию

            for (int j = i + 1; j < arrayForSort.length; j++) {
                //проходим по всему массиву и проверяем, есть ли элемент с меньшим значением, если есть,то записываем
                //егов переменную мин и записываем позицию. и проверяем дальше, есть ли меньше элемент
                if (revers) {// для сортировки от большего к меньшему
                    if (arrayForSort[j] > min) {
                        min = arrayForSort[j];
                        pos = j;

                    }
                } else {// для сортировки от меньшего к большему
                    if (arrayForSort[j] < min) {
                        min = arrayForSort[j];
                        pos = j;

                    }
                }
            }
                int t = arrayForSort[i];
                arrayForSort[i] = arrayForSort[pos];
                arrayForSort[pos] = t;


        }

//    public void suffleArray(){
//
//    }
        System.out.println(" После сортировки  ");
        for (int val : arrayForSort) {
            System.out.print(" " + val);

        }
    }

}
