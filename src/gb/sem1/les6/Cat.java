package gb.sem1.les6;

public class Cat extends Animal{
    private static int countAnimal=0;
    public Cat(String name, Integer age, boolean canSwim, Integer maxDistWalk, Integer maxDistSwim) {
        super(name, age, canSwim, maxDistWalk, maxDistSwim);
        countAnimal++;
    }
    public void getCount() {
        System.out.println("Общее количество объектов класса " + this.getClassName() + " = "+countAnimal);
    }

}
