package dz18052020;

public class Main {
    public static void main(String[] args) {

        //Создаем препятствия


        Obstracle[] obstracles = {

                new Treadmill(10000),
                new Wall(1)
        };

       
        // Создаем участников соревнований


        Moving [] competitors = {

                new Cat("Барcик", 300, 3),
                new Human("Боря", 5000, 2),
                new Robot("Федя", 10000, 5)
        };


        //Начинаем соревнования
       // cat1.run(treadmill.getDistTreadmill());
        //cat1.jump(wall.getMaxHeightWall());

        //human1.run(treadmill.getDistTreadmill());
        //human1.jump(wall.getMaxHeightWall());

        //robot1.run(treadmill.getDistTreadmill());
        //robot1.jump(wall.getMaxHeightWall());

        //for (Moving m: competitors) {

        //    m.run(10000);
        //    m.jump(3);

       // }

        // Проводим соревнования по бегу

        for (Moving m: competitors) {
            for (Obstracle o:obstracles ) {
                o.do_it(m);

            }



        }



        // Проводим соревнования по бегу
       /* if (treadmill.getDistTreadmill() <= cat1.getMaxRunDistans()) {

            System.out.println("Кот " + cat1.getName() + " успешно пробежал " + treadmill.getDistTreadmill() + " метров");

        }else {

            System.out.println("Кот " + cat1.getName() + " не пробежал " + treadmill.getDistTreadmill() + " метров");
        }

        if (treadmill.getDistTreadmill() <= human1.getMaxRunDistans()) {

            System.out.println("Человек " + human1.getName() + " успешно пробежал " + treadmill.getDistTreadmill() + " метров");

        }else {

            System.out.println("Человек " + human1.getName() + " не пробежал " + treadmill.getDistTreadmill() + " метров");
        }

        if (treadmill.getDistTreadmill() <= robot1.getMaxRunDistans()) {

            System.out.println("Робот " + robot1.getName() + " успешно пробежал " + treadmill.getDistTreadmill() + " метров");

        }else {

            System.out.println("Робот " + robot1.getName() + " не пробежал " + treadmill.getDistTreadmill() + " метров");
        }*/
    }
}