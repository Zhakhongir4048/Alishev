package AbstractClassesLesson41;

public class Dog extends Animal implements AbleToMakeSound{

    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
