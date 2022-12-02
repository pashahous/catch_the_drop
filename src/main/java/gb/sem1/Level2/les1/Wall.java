package gb.sem1.Level2.les1;

public class Wall implements Barrier {
    private int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean useBarrier(WalkJump obj) {
        System.out.println("Участник по имени " + obj.getName() + " Класса " + obj.getClassName() + "  ПЫТАЕТСЯ ПРЫГНУТЬ");
        if (obj.canJump(heightWall)) {
            obj.jump();
            return true;
        }
        System.out.println("Участник по имени " + obj.getName() + " Класса " + obj.getClassName() + " не может так высоко прыгнуть");
        return false;
    }

}
