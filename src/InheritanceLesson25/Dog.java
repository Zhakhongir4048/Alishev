package InheritanceLesson25;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating");       // переопределение метода родительского в свой конкретный метод
    }

    public void bark() {
        System.out.println("I am barking");
    }


    public void showName(){
        System.out.println(name);
    }

}
