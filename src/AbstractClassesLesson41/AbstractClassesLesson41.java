package AbstractClassesLesson41;

public class AbstractClassesLesson41 {
    public static void main(String[] args) {
         Cat cat = new Cat();
         Dog dog = new Dog();
         cat.makeSound();
         dog.makeSound();
         cat.eat();
         dog.eat();
    }
}
/* В чём мотивация использования абстрактных классов, дело в том, что объекты класса Cat и Dog - это те объекты, которые мы видели в реальной жизни
Создание объекта класса Animal не имеет смысла, как так, Животное - это концепция, мы не можем иметь объект животное (не является сущностью, а является концепцией)
 */
/* Абстрактные классы используются тогда, когда мы хотим создать иерархию классов, но класс-родитель не является самостоятельным классом, этот класс Animal не самостоятельный
От него нужно обязательно наследоваться и обязательно нужно реализовать абстрактные методы, если они есть
 */
/* В классах-наследниках мы можем реализовать метод абстрактный класс очень похож на интерфейсы
Разница
1) Интерфейс это контракт, интерфейс - это то, что класс умеет делать, а абстрактный класс это то, чем класс является
2) В Java мы можем реализовывать сколько угодно интерфейсов, но мы можем унаследоваться только от одного класса

*/