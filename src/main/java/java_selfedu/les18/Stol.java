package java_selfedu.les18;

public class Stol extends Mebel{
    private int numOfLeg;
    private double square;
    public Stol(String name, long price, double width, double height, int numOfLeg,double square) {
        super(name, price, width, height);
        this.numOfLeg = numOfLeg;
        this.square = this.getWidth() * this.getHeight();
    }

    public double getSquare() {
        return square;
    }

    public int getNumOfLeg() {
        return numOfLeg;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("Ножек шт: %d  Площадь: %f \n",getNumOfLeg(),(float)getSquare());

    }

}
