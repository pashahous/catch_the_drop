package gb.sem1.les7;

import java.util.Random;

public class Cat {
    public String name;
    private boolean sutost;

    private final int MAX_COUNT_OF_FOOD = 50;
    private int currentCountOfFood;
    Random random = new Random();
    public Cat(String name) {
        this.name = name;
        this.currentCountOfFood = random.nextInt(MAX_COUNT_OF_FOOD);
        this.sutost = this.currentCountOfFood == MAX_COUNT_OF_FOOD;
    }

    public String getName() {
        return name;
    }

    public int getCurrentCountOfFood() {
        return currentCountOfFood;
    }

    public void eatFood(Plate plate,int countEat){
        System.out.printf("Кот %s хочет съесть %d еды \n",this.name,countEat);

        if (plate.eatFood(countEat)){
            this.currentCountOfFood += countEat;
            System.out.printf("Кот %s съел %d еды и его желудок наполнился до %d \n ",this.name,countEat,this.currentCountOfFood);
        } else {
            System.out.println("Кот " + this.name+ " сказал :- В миске мало еды, есть не буду");
        }

    }
    public boolean isSutost() {
        System.out.println("Cat " + this.name + ((this.sutost)?" сытый.":" голодный." + "  Кол еды в животе=" + this.currentCountOfFood));
        return this.sutost;
    }

}
