package WildcardsGenericsLesson34;

import java.util.ArrayList;
import java.util.List;

public class WildcardsGenericsLesson34 {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>(); // В этом ArrayList могут храниться объекты класса Animal
        listOfAnimal.add(new Animal(1));                   // добавим 2 животных
        listOfAnimal.add(new Animal(2));

        test(listOfAnimal);


        List<Dog> listOfDogs = new ArrayList<>();     // В этом листе содержатся объекты класса Dog
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        // test(listOfDogs);       // ОШИБКА, МЫ НЕ МОЖЕМ ТАК ПЕРЕДАВАТЬ , ЧТОБЫ ЗАРАБОТАЛО НАМ НУЖНО ИСПОЛЬЗОВАТЬ WILDCARDS, нам нужно поставить знак вопроса в дженерике


        eatMethod(listOfAnimal);
        eatMethod(listOfDogs);
       /*
                Object
                Animal
                Dog
       */


    }

    private static void test(List<? extends Animal> list) {  // Метод для вывода животных
        for (Animal animal : list) {
            System.out.println(animal);           // Когда будем выводить животное на экран, у нас будет вызываться метод toString(), который объявлен у класса Object
        }                                        // То есть у родителя, класса Animal
    }

    public static void eatMethod(List<? extends Animal> animals) {
        for (Animal animal : animals) {
          animal.eat();                                     // Вызываем метод класса Animal, также будет работать и для потомок
        }
    }
}
/* У класса Animal создадим конструктор , который будет принимать на вход какое-то число, допустим id

   public Animal(int id) {
        this.id = id;
    }

*/

/* Переопределим метод toString() который возвращал бы id

     @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }

 */
/* Если мы создали свой конструктор в классе Animal, соответственно дефолтный конструктор , конструктор по умолчанию он пропал , потому, что мы создали свой конструктор
В классе  Dog не определён конструктор , то по умолчанию здесь, в конструкторе по умолчанию у потомка вызывается конструктор базового класса по умолчанию его родителя,
если не будет у класса-родителя конструктора по умолчанию, то в классе-потомка будет ошибка

package WildcardsGenericsLesson34;

public class Dog extends Animal{
  public Dog(){
      super();             // Ошибка
  }
}


Пути решения
1) создать дефолтный конструктор у родителя , который принимает ничего на вход
2) нужно передать что-то при вызове базового конструктора в конструкторе потомка
 */
/* Мы на уроке от полиморфизма узнали, если у нас метод принимает на вход в качестве аргументов какой-то класс , то все дети, потомки этого класса
тоже могут переданы в качестве аргумента
 */
/*  private static void test(List<?> list)

Говорит то, что в этот метод можешь передать лист любых объектов, теперь содержимое класс List мы не можем рассматривать как Animal, теперь содержимое объекта класса List
будет рассматриваться как массив объектов, потому , что сюда мы можем передать любой объект, теперь у всех этих объектов будет общий родитель, объект класса Object
Этот лист теперь мы рассматриваем как лист каких-то объектов , здесь мы можем вызывать только методы определённые у класса Object

 */
/* Если мы хотим дать понять Java'e, что мы хотим поставлять в метод test листы Animal или любого другого класса , которые наследуются от Animal надо сделать вот так

  private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
 */
/* Если мы делаем super , в листе который мы подаём в качестве аргументов, хотим видеть только те классы , которые находятся выше Animal в иерархии наследования ,
теперь в метод можем подавать листы , который содержит объекты класса Object , эти объекты мы не можем рассматривать как объекты класса Animal
ЭТО НЕ ТАК ПОЛЕЗНО

    private static void test(List<? super Animal> list){

    }

 */