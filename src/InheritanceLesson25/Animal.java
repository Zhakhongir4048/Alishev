package InheritanceLesson25;

public class Animal {

    String name = "Some animal";


    public void eat() {
        System.out.println("I am eating");  // Метод не актуален, потому, что  мы его переопределили в классе Dog
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}