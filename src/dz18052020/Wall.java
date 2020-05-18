package dz18052020;

public class Wall extends Obstracle{

    private int maxHeightWall;

    @Override
    public void do_it(Moving moving) {
        moving.jump(maxHeightWall);
    }

    public Wall(int maxHeightWall) {
        this.maxHeightWall = maxHeightWall;
    }

    public int getMaxHeightWall() {
        return maxHeightWall;
    }
}
