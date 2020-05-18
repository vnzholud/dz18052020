package dz18052020;

public class Cat implements Moving{

    private String name;

    private int maxRunDistans;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistans, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistans = maxRunDistans;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int dist) {

        if (dist<=maxRunDistans) {

            System.out.println("Кот "+name+" бежит дистанцию "+dist+" метров");
        } else {

            System.out.println("Кот "+name+" не может пробежать дистанцию в "+dist+" метров");
        }


    }

    @Override
    public void jump(int height) {

        if (height<=maxJumpHeight){

            System.out.println("Кот "+name+" прыгает через стену в "+height+" метров");
        } else {

            System.out.println("Кот "+name+" не может перепрыгнуть через стену в "+height+" метров");
        }


    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistans() {
        return maxRunDistans;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
