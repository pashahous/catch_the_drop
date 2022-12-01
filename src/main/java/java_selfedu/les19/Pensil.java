package java_selfedu.les19;

public class Pensil extends Stationery {
    private Integer numOfProducts =0;
    private String color;

    Pensil(){
        super(0,false,"0");
    }

    public Pensil(long price, boolean nalichie, String id, Integer numOfProducts, String color) {
        super(price, nalichie, id);
        this.numOfProducts = numOfProducts;
        if (this.numOfProducts > 0) this.setNalichie(true);
        else this.setNalichie(false);
        this.color = color;
    }

    public void displayPencil(){
        super.display();
        String clsname = this.getClass().getName();
        String [] inStr = clsname.split("\\.");
        String classStr = inStr[inStr.length-1]; //берем последний элемент массива
        System.out.printf("Класс %s  \nКоличество продуктов: %d  Цвет: %s",classStr,getNumOfProducts(),getColor());
        System.out.println("\n================================================================================");
    }

    public Integer getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(Integer numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
