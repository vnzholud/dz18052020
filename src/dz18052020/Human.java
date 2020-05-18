package dz18052020;

public class Human implements Moving{

    private String name;
    private int maxRunDistans;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistans, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistans = maxRunDistans;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int dist) {

            if (dist<=maxRunDistans){
                System.out.println("Человек "+name+" бежит дистанцию в "+dist+" метров");

            } else {

                System.out.println("Человек "+name+" не может пробежать дистанцию в "+dist+" метров");
            }




    }

    @Override
    public void jump(int height) {

            if (height<=maxJumpHeight){

                System.out.println("Человек "+name+" прыгает через стену в "+height+" метров");
            }  else {

               System.out.println("Человек "+name+" не может перепрыгнуть стену в "+height+" метров");
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
