package java_selfedu.les19;

import java_selfedu.les20.ex1.Graph;

public class Pen extends Stationery {
    private Integer numOfProducts =0;
    private String color;

    Pen() {

        super(0,true,"0");
    }

    public Pen(long price, boolean nalichie, String id,Integer numOfProducts, String color) {
        super(price, nalichie, id);
        numOfProducts+=1;
        this.numOfProducts = numOfProducts;
        this.color = color;
    }


    public void displayPen(){
        super.displayPen();
        System.out.printf("Количество продуктов: %d  Цвет: %s",getNumOfProducts(),getColor());
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
