package AnonymousClassesLesson35;


interface AbleToEat{
    public void eat();
}



public class Test {
    public static void main(String[] args) {


        AbleToEat ableToEat = new AbleToEat() {
           @Override
           public void eat() {
               System.out.println("Someone is eating...");
           }
       };

       ableToEat.eat();
    }
}
/* Представим , что мы хотим переопределить метод eat() , нас не устраивает реализация этого метода, но что, если нам надо использовать в коде один раз , объект класса Animal
с переопределённым методом ДЛЯ ЭТОГО БЫЛИ ПРИДУМАНЫ АНОНИМНЫЕ КЛАССЫ
Теперь , если мы хотим создать объект класса Animal с переопределённым методом eat(), то мы можем сделать следующее


      Animal animal2 = new Animal() {
         @Override
         public void eat() {
             System.out.println("Other animal is eating...");
         }
     };


 */
/* Мой пример
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}



public class Test {
    public static void main(String[] args) {
      Animal animal = new Animal();
      animal.eat();

     Animal animal2 = new Animal() {                   // Создаём анонимный класс , который наследуется от Animal, который переопределяет метод eat()
         @Override                                     // В переменной animal2  лежит не класс Animal, не объект класса  Animal , а лежит объект наследник класса Animal
         public void eat() {                           // C переопределённым методом eat() , один раз можем только использовать
             System.out.println("Other animal is eating...");
         }
     };

     animal2.eat();
    }
}
 */
/* Мы не можем создавать объекты из интерфейсов, в интерфейсов нет реализации */