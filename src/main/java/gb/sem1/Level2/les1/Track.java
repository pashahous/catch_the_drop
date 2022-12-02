package gb.sem1.Level2.les1;

public class Track implements Barrier {
private int lenghtRoad;

    public Track(int lenghtRoad) {
        this.lenghtRoad = lenghtRoad;
    }

    @Override
    public boolean useBarrier(WalkJump obj) {
        System.out.println("Участник по имени " + obj.getName() + " Класса " + obj.getClassName() + "  попытается пробежать");
        if(obj.canRun(lenghtRoad)) {
            obj.run();
            return true;
        }
            System.out.println("Участник по имени " + obj.getName() + " Класса " + obj.getClassName() + " не может так далеко бежать");
            return false;
    }

}
