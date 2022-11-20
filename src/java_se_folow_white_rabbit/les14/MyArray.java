package java_se_folow_white_rabbit.les14;

public class MyArray {

    int[] name_array = new int[5];
    Candy[] candy_array = new Candy[5];

    public void fillArrayCandy() {
// создаем объекты и добавляем в массив
        for (int i = 0; i < candy_array.length; i++) {
            candy_array[i] = new Candy();

        }
    }

    public void printArrayCandy() {
        for (Candy c : candy_array) {
            c.sayName();

        }
    }


}
