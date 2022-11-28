package java_selfedu.les19;

public class Stationery {
    private long price;
    private boolean nalichie;
    private String id;
    Stationery() {
    }

    public Stationery(long price, boolean nalichie, String id) {
        this.price = price;
        this.nalichie = nalichie;
        this.id = id;
    }

    public void displayPen(){
        System.out.printf("\nЦена: %d  Наличие: %s Идентификатор: %s\n",getPrice(),getNalichie(),getId());
    }


    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getNalichie() {
        return (nalichie)?"Есть":"Нет";
    }

    public void setNalichie(boolean nalichie) {
        this.nalichie = nalichie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
