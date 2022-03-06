package WildcardsGenericsLesson34;

public class Animal {

   private int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }


    @Override
    public String toString() {              // Можно было сделать вот так , вызвать статический метод value() класса String
        return "Animal{" +                  // Пример String.valueOf(id);
                "id=" + id +
                '}';
    }

    public void eat(){
        System.out.println("Animal is eating...");        // У объектов класса Dog тоже есть этот метод , потому , что мы унаследовались от класса Animal
    }

}
