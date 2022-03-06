package NestedClassesLesson43;

public class Electrocar {
    private int id;

    // Вложенный нестатический класс относится к объекту, они имеют доступ к полям объекта
    private class Motor {          // Внутри каждой электромашины есть мотор
        public void startMotor() {
            System.out.println("Motor" + id + " is starting...");

        }
    }

    // Статический вложенный класс
    public static class Battery { // Не имеет доступа к полям нестатическим класса Electrocar, только к статическим полям имеет доступ
        public void change() {
            System.out.println("Battery is changing...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }


    public void start() {
        Motor motor = new Motor();
        motor.startMotor();


        final int x = 1; // Обязательно должно быть final

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar " + id + " is starting...");
    }
}
