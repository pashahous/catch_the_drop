package java_selfedu.les18;

public class Mebel implements MebelInterface{
    private String name;
    private long price;
    private double width;
    private double height;

    public Mebel(String name, long price, double width, double height) {
        this.name = name;
        this.price = price;
        this.width = width;
        this.height = height;
    }

    public void printInfo(){
        System.out.printf("\nТип мебели: %s  \nЦена: %d \nШирина: %f \nВысота: %f \n",getName(),getPrice(),getWidth(),getHeight());
    }



    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
