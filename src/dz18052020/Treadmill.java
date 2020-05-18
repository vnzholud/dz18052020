package dz18052020;

public class Treadmill extends Obstracle{

    private int distTreadmill;

    @Override
    public void do_it(Moving moving) {
        moving.run(distTreadmill);
    }

    public Treadmill(int distTreadmill) {
        this.distTreadmill = distTreadmill;
    }

    public int getDistTreadmill() {
        return distTreadmill;
    }
}
