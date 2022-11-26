package java_selfedu.les18;

public class Styl extends Mebel{
    private int numLegs;
    private float heightLegs;
    private boolean spinka;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Число ножек: %d  Высота ножек: %f Наличие спинки %s ",getNumLegs(),getHeightLegs(),(isSpinka()?"есть":"Net"));
    }

    public int getNumLegs() {
        return numLegs;
    }

    public float getHeightLegs() {
        return heightLegs;
    }

    public boolean isSpinka() {
        return spinka;
    }

    public Styl(String name, long price, double width, double height, int numLegs, float heightLegs, boolean spinka) {
        super(name, price, width, height);
        this.numLegs = numLegs;
        this.heightLegs = heightLegs;
        this.spinka = spinka;
    }
}
