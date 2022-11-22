package gb.sem1.les7;

import java.util.Random;

public class Plate {
    private int countOfFood;
    private final int MAX_COUNT_OF_FOOD = 100;
    Random random = new Random();

    public Plate(int randomFoodTillMaxx) {
        this.countOfFood = random.nextInt(randomFoodTillMaxx);
        System.out.println("Кол еды в миске " + this.countOfFood);


    }
    public Plate(){
        this.countOfFood = MAX_COUNT_OF_FOOD;
        System.out.println("Кол еды в миске " + this.countOfFood);

    }

    public void addFood(int food) {
        int currentAdd = this.countOfFood + food;
        if (currentAdd > MAX_COUNT_OF_FOOD)
            this.countOfFood = MAX_COUNT_OF_FOOD;
        else
            this.countOfFood += food;
    }

    public boolean eatFood(int food){
        int currentEat = this.countOfFood - food;
        if(currentEat >= 0) { // если остаток больше кол еды оставшееся в тарелке, то собака может есть.
            this.countOfFood = currentEat;
            System.out.println("Кол еды в миске уменьшилось до  " + this.countOfFood);
            return true;
        } else return false;
    }

}
