package FavaSEFolowWhiteRabbit.les14;

class Candy {

    private String randomDigitalName;
    private int x;
    private int y;

    Candy() {
        this.x = (int)(Math.random()*500);
        this.y = (int)(Math.random()*500);
        this.randomDigitalName = Integer.toString((int)(Math.random() * 1000));
    }


    void sayName() {
        System.out.println("\n --------------------------------My random name with digital string " + this.randomDigitalName);
        System.out.println("x = "+this.x + "y = " + this.y);
        System.out.println("My link is  " + this);

    }
}
