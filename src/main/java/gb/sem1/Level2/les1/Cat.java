package gb.sem1.Level2.les1;

public class Cat implements WalkJump {
    private static String nameClass = "Кот";

    private int maxJump;
    private int maxLenghtOfWalk;
    private String name;

    public Cat(int maxJump, int maxLenghtOfWalk, String name) {
        this.maxJump = maxJump;
        this.maxLenghtOfWalk = maxLenghtOfWalk;
        this.name = name;
    }

    @Override
    public boolean jump(int height) {
        if (maxJump > height) {
            System.out.println(getName() + " Класса " + this.getClass().getName() + "  успешно перепрыгнул препятствие " + height);
            return true;
        }
        System.out.println("!!!!" +  getName() + " Класса " + this.getClass().getName() + "  не смог прыгнуть выше " + height);
        return false;
    }

    @Override
    public boolean run(int lenght) {
        if (maxLenghtOfWalk > lenght){
            System.out.println(getName() + " Класса " + this.getClass().getName() + "  успешно пробежал " + lenght);
        return true;
    }
        System.out.println("!!!!" +  getName() + " Класса " + this.getClass().getName() + "  не смог прыгнуть выше " + lenght);
    return false;
}
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return nameClass;
    }



}
