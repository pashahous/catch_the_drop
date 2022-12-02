package gb.sem1.Level2.les1;

public class Track implements Barrier {
private int lenghtRoad;

    public Track(int lenghtRoad) {
        this.lenghtRoad = lenghtRoad;
    }

    @Override
    public boolean useBarrier(WalkJump obj) {

        if(obj.run(lenghtRoad)) {
            return true;
        }
            return false;
    }

}
