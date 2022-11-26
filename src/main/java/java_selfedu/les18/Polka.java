package java_selfedu.les18;

public class Polka extends Mebel {
    private int numOfSegments; // число сегментов полки
    private double widthSegment;
    private double heightSegment;

    public Polka(String name, long price, double width, double height, int numOfSegments, double widthSegment, double heightSegment) {
        super(name, price, width, height);
        this.numOfSegments = numOfSegments;
        this.widthSegment = widthSegment;
        this.heightSegment = heightSegment;
    }

    public int getNumOfSegments() {
        return numOfSegments;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Число сегментов: %d  Размеры сегментов- Ширина: %f Высота: %f ",getNumOfSegments(),getWidth(),getHeight());

    }

    public double getWidthSegment() {
        return widthSegment;
    }

    public double getHeightSegment() {
        return heightSegment;
    }
}
