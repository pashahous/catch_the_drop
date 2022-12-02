package gb.sem1.Level2.les1;

public class Human implements WalkJump{
    private static String nameClass = "Человек";
    private int maxJump;
    private int maxLenghtOfWalk;
    private String name;

    public Human(int maxJump, int maxLenghtOfWalk, String name) {
        this.maxJump = maxJump;
        this.maxLenghtOfWalk = maxLenghtOfWalk;
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(nameClass + " прыгнул");
    }

    @Override
    public void run() {
        System.out.println(nameClass + " бежит");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean canJump(int height) {
        return maxJump > height;
    }
    @Override
    public String getClassName() {
        return nameClass;
    }
    @Override
    public boolean canRun(int lenght) {
        return maxLenghtOfWalk >lenght ;
    }

}
