package IntroductionToParameterizationGenericsLesson33;

import java.util.ArrayList;
import java.util.List;

public class IntroductionToParameterizationGenericsLesson33 {
    public static void main(String[] args) {
        ///////////////////// Java 5 ///////////////////////

        List animals = new ArrayList();                      // В этом ArrayList могут храниться любые объекты
        Animal ani = new Animal();
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");
        animals.add(ani);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        ///////////////////// c появлением дженериков /////////////////

        List<String> animals2 = new ArrayList<String>();   // В этом ArrayList могут храниться только строки
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String get = animals2.get(1);


        /////////////////// Java 7 //////////////////////

        List<String> animals3 = new ArrayList<>();        // Справа мы можем не указывать тип параметризации

    }
}

class Animal {

}
/*
List - это интерфейс
ArrayList - это класс


 List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");

        String animal = animals.get(1);

        Появляется ошибка , слева у нас String, справа у нас Object


Объект класса ArrayList хранит в себе объекты класса Object , самого верхнего родительского класса , от которого все классы наследуются
Чтобы мы не положили в этот ArrayList, он будет хранить в себе объекты класса Object, хранит не конкретные объекты каких-то классов, а хранит в себе объекты класса Object

  String animal = (String) animals.get(1);
  Надо вот так сделать DownCasting , нисходящее преобразование сделать
 */
/* В пятой Java был придуман такой механизм - параметризация классов */