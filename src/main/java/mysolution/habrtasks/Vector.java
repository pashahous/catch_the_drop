package main.java.mysolution.habrtasks;
/*Задача:
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
конструктор с параметрами в виде списка координат x, y, z
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
$\sqrt{x^2 + y^2 + z^2}$
метод, вычисляющий скалярное произведение:
$x_1x_2 + y_1y_2 + z_1z_2$
метод, вычисляющий векторное произведение с другим вектором:
$(y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)$
метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению
 векторов, деленному на произведение модулей (длин) векторов:
$\frac{(a,b)}{|a| \cdot |b|}$
методы для суммы и разности:
$(x_1 + x_2, y_1 + y_2, z_1 + z_2)$
$(x_1 - x_2, y_1 - y_2, z_1 - z_2)$
статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

Если метод возвращает вектор, то он должен возвращать н*/

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // длинна вектора = корень из суммы квадратов каждай координаты
    public double lenght() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    //сумма произведений соответствующих координат
    public double scalarVector(Vector vector) {
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    // метод, вычисляющий векторное произведение
    public Vector crossVector(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }
}
