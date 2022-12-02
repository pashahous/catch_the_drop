package gb.sem1.Level2.les1;

public class Wall implements Barrier {
    private int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean useBarrier(WalkJump obj) {
        if (obj.jump(heightWall)) {
            return true;
        }
        return false;
    }

}
