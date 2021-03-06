package interfacesLesson26;



public class InterfacesLesson26 {
    public static void main(String[] args) {

    }
}
/* Интерфейсы используются в больших проектах, в стандартных библиотеках Java (В тех же коллекциях например)
В папке src создадим подкапку которую назовём interfacesLesson26, мы только что создали пакет (пакет - это просто папки)
Пакеты используются для того , чтобы разрешать коллизии имён классов , например в пределах папки src мы не можем создать 2 класса
с именем Arrays , в папке src не может быть 2 класса с одинаковыми названиями , мы можем создать класс Arrays в пакете interfacesLesson26, то есть
пакеты работают как обычные папки, разделяя между собой классы

В пакете или в папке  interfacesLesson26 создадим новый класс , назовём его Animal
При создании класса внутри пакета, у нас этот класс  визуально разграничивается от других классов, в самом классе Animal первой строчкой
упоминается то , что наш пакет лежит в пакете interfacesLesson26

Давайте дадим нашему классу Animal поле

public int id;

у каждого животного будет какой-то идентификатор

Давайте дадим какой-то метод

public void sleep(){
System.out.println("I am sleeping");   - каждое животное будет у нас спать
}

То есть на объекте  класса Animal  мы сможем вызвать метод sleep() и он выведет на экран I am sleeping
 */
/* Давайте создадим на этой папке ещё один класс и назовём его Person
и у человека будет строковая переменная name
и у нас будет метод

public void sayHello(){
System.out.println("Hello");
}
 */
/* Создадим ещё один класс Test в котором у нас будет метод main, в котором будем создавать наши объекты и тестировать их
*
* public class Test {
    public static void main(String[] args) {
          Animal animal1 = new Animal();
          Person person1 = new Person();

    }
}
* дополнительно создадим конструктор в этих классах Animal и Person
* горячая клавиша создания конструкторов fn + alt + print screen*/
/* Вызываем методы на нашим объектах

public class Test {
    public static void main(String[] args) {
          Animal animal1 = new Animal(1);
          Person person1 = new Person("Bob");
          animal1.sleep();
          person1.sayHello();
    }
}
 */
/* Класс Person и класс Animal между собой никак не связаны, это вообще разные понятия (понятие животное и понятие человека)
но допустим мы хотим чтобы эти 2 класса имели общее какое-то поведение , мы видим что у Animal есть идентификатор(id) и мы видим что у класса Person есть имя (name)
Поэтому давайте мы скажем что  эти 2 класса имеют общее поведение , эти два класса могут показывать информацию о себе , то есть Animal может говорить , может показывать свой id
а Person всем может говорить  своё имя, то есть у нас эти классы, у них есть общее поведение , и это общее поведение мы вынесем в интерфейс

Для того чтобы создать интерфейс, нам надо правой кнопкой мыши нажать на наш пакет , выбрать Java Class , но вместо того, чтобы создать Java class мы должны выбрать интерфейс
и здесь мы должны задать имя нашему интерфейсу , давайте назовём его Info , потому, что наш интерфейс он должен выводить информацию  нашего класса Animal и нашего класса Person

Вы видите вместо того чтобы быть классом , это интерфейс, ключевое слово интерфейс

public interface Info {

}


Давайте создадим метод, которую  назовём showInfo()


public interface Info {
      public void showInfo(){

}

Вы видите как только мы захотели нашему методу назначить какую-ту реализацию у нас появилась ошибка interface methods cannot have body
У методов интерфейса не может быть тела , а тело метода  всё что находится между фигурными скобками , у метода интерфейса фигурных скобок быть не может,
ПОТОМУ ЧТО ИНТЕРФЕЙС НЕ ЗАДАЁТ РЕАЛИЗАЦИЮ , ИНТЕРФЕЙС ЗАДАЁТ КАРКАС
Это понятно, мы понимаем что у классов Animal и Person реализация метода showInfo() будет разным
В классе Person метод snowInfo() должна возвращаться строка , в классе Animal метод snowInfo() должна возвращаться целое число и имена у этих переменных тоже раэное (id, name)

Поэтому реализация или имплементация метода showInfo() у этих классов будет разное , поэтому если мы здесь написали бы какую-ту реализацию , то она не подходила бы для какого-то
множества классов , поэтому здесь мы должны убрать фигурные скобки и должны поставить точку с запятой и всё наш интерфейс готов

public interface Info {

    public void  showInfo();
}


в интерфейсах не может быть реализации методов , в интерфейсах могут быть лишь их сигнатуры

 */
/* Давайте теперь перейдём в наш класс Animal, в нашем классе Animal мы напишем implements Info , то же самое сделаем в классе Person

public class Person implements Info{
    public String name;

    public void sayHello(){
        System.out.println("Hello");
    }


    public Person(String name) {
        this.name = name;
    }
}

public class Animal implements Info {
    public int id;

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }


}
 */
/* implements переводится как реализует , это значит , что наши классы теперь обязаны реализовать в себе метод showInfo()
Мы видим теперь появилась ошибка , после того как мы написали implements Info
Наш класс Person и класс Animal должны реализовывать метод showInfo() в интерфейсе Info, думайте об интерфейсах как о контракте
ЕСЛИ МЫ СОЗДАЁМ ИНТЕРФЕЙС С КАКОЙ-ТО СИГНАТУРОЙ МЕТОДА , ПРИЧЁМ ЭТИХ СИГНАТУР МЕТОДА МОЖЕТ БЫТЬ ЛЮБОЕ КОЛИЧЕСТВО , ТО ЕСЛИ В ДРУГОМ КЛАССЕ (ОБЫЧНОМ КЛАССЕ) МЫ
ИМПЛЕМЕНТИРУЕМ ЭТОТ ИНТЕРФЕЙС , ТО МЫ ОБЯЗАНЫ РЕАЛИЗОВАТЬ, ИМЛЕМЕНТИРОВАТЬ ВСЕ МЕТОДЫ , КОТОРЫЕ СУЩЕСТВУЮТ В ЭТОМ  ИНТЕРФЕЙСЕ!!!
Теперь у нас эти 2 класса обязаны иметь метод showInfo()


Давайте в каждом классе мы этот метод создадим

package interfacesLesson26;

public class Person implements Info{
    public String name;

    public void sayHello(){
        System.out.println("Hello");
    }


    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {

    }


}

 */

/* Важно то, что сигнатура метода, вообще в любом классе который реализует интерфейс , это сигнатура метода должна совпадать с сигнатурой метода в интерфейсе
Давайте мы выведем здесь, то есть метод showInfo() В классе Animal выводит id
  @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }

Реализуем этот же метод в классе Person, можно реализовывать эти методы в ручную , но если этих методов в интерфейсе много , то здесь вы можете воспользоваться помощью которая
предоставляет вам среда разработки, для этого есть красная лампочка и туда нажимаете , она поможет вам, вам всего лишь надо будет самим написать реализацию
Аннотация  @Override обязывает имя нашего метода в классе Person быть таким же , что и имя в нашем интерфейсе
 */
/* Хоть эти методы в двух наших классах называются одинаково , но реализация у них разное
 *  В чём суть интерфейса ?
 * если класс реализует какой-то интерфейс - это значит что, он обязан иметь методы которые в этом интерфейсе указаны и это такой способ утвердить, точно знать, что класс имеет
 * какие-то методы
 * Например  у нас есть интерфейс Runnable, то мы понимаем что все классы реализующие этот интерфейс , они имеют метод run
 * (кстати любой класс может реализовывать любое количество интерфейсов, но класс может наследоваться только от одного класса) */
/* СДЕЛАЕМ ЧТО-ТО НОВОЕ

package interfacesLesson26;

public class Test {
    public static void main(String[] args) {
       Info info1 = new Animal(1);
       Info info2  = new Person("Bob");

    }
}


Мы можем делать так потому, что эти классы реализуют интерфейс Info, так как между ними существует связь , связь между ними такая , что в каждом классе Animal и классе Person
существует методы из интерфейса Info, потому, что эти классы реализуют  этот интерфейс
Мы можем ссылать  переменную типа Info на объекты этих классов (Animal,Person)
Мы можем на объекте интерфейса Info вызвать единственный метод showInfo()
Нам не важно какие методы имеют эти  объекты new Animal(1) и new Person("Bob) , нам важно лишь те объекты которые им даны от интерфейса Info
Таким образом мы сужжаем все методы классов Animal и Person до единственного метода showInfo()
Мы не можем в объекте info1 получить доступ к другим методам класса , например к методу sleep() класса Animal, мы имеем доступ только к тем методам, которые описаны в интерфейсах


То есть мы огранили все методы нашего класса Animal например, мы рассматриваем объект класса Animal  не как объект класса Animal , а как нечто что реализует интерфейс Info
 */
/* Ещё один пример использования интерфейсов
Создадим метод, этот метод принимает в качестве аргументов нечто что реализует(имплементирует) интерфейс Info , и у этого нечто , что реализует интерфейс Info мы можем вызвать
единственный метод, который описан в интерфейсе Info (showInfo())


 public static void outputInfo(Info info) {
        info.showInfo();
    }
}

ТЕПЕРЬ ЭТОТ МЕТОД МОЖЕТ ДЕЙСТВОВАТЬ НА ЛЮБОМ ИЗ ОБЪЕКТОВ, КЛАСС КОТОРОГО РЕАЛИЗУЕТ ИНТЕРФЕЙС INFO, мы в качестве аргументов можем подать либо Animal либо Person

 */
/* Нечто ещё более прекрасное что мы можем создать наши обычные объекты класса Animal и Person , и мы можем эти объекты в качестве аргументов поместить в наш метод outputInfo()

  Animal animal = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal);
        outputInfo(person1);

 */