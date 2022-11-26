package java_selfedu.les18;

public class Shkaf extends Mebel{
    private String material;
    private int numStvorok;
    private int numPolok;

    public Shkaf(String name, long price, double width, double height, String material, int numStvorok, int numPolok) {
        super(name, price, width, height);
        this.material = material;
        this.numStvorok = numStvorok;
        this.numPolok = numPolok;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Материал: %s Створок шт: %d Полок шт: %d ",getMaterial(),getNumStvorok(),getNumPolok());
    }

    public String getMaterial() {
        return material;
    }

    public int getNumStvorok() {
        return numStvorok;
    }

    public int getNumPolok() {
        return numPolok;
    }
}
