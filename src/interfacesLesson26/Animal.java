package interfacesLesson26;

public class Animal implements Info {
    public int id;

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
