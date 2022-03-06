package ClassObjectMethodsToStringLesson24;

public class ClassObjectMethodsToStringLesson24 {
    public static void main(String[] args) {
        String string = "Hello";            // создаём объект
        System.out.println(string);        // этот объект печатаем


        TV tv = new TV("LG", 100);
        // tv.toString();// все методы класса Object доступны
        System.out.println(tv);
    }
}

class TV {
    private String name;
    private int age;

    public TV(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "," + age;
    }
}
/* Класс Object скрыт от наших глаз , метод toString(), который есть у этого класса
* Вернёмся к 20 уроку, где у нас класс Brend , мы создаём объект этого класса, мы если попытаемся вывести на экран этот объект
*       Brend brend1 = new Brend("Bob");
        System.out.println(brend1);

        Вывод
        Brend@eed1f14*/
/*  Вывод такой, дело в классе Object
Класс Object - это класс, который есть у всех классов(классов, которые мы делаем сами, классы, которые есть в стандартном библиотеке Java), у любого класса
Любой класс в Java наследуется от класса Object
Когда мы наследуемся от другого класса, мы взаимствуем все его методы, все его поля, то есть класс Brend наследуется от класса Object и он получает все его методы и поля
Наследование происходит скрыто
слово extends обозначает наследование
Если мы создаём объект класса Brend, то он, одновременно является объектом класса Object, потому,что все объекты являются объектами класса Object
Все классы которые мы делаем и если мы из них создаём объекты, то все эти классы должны быть не только классами , которые мы декларируем, но они должны быть просто объектами
 */
/* откуда мы получаем такую вещь Brend@eed1f14  ?
мы получаем от такого метода, который достался от класса Object, этот метод называется toString()
 */

/* TV tv = new TV("LG",100);
        tv.                                             // все методы класса Object доступны


 нашему объекту доступны все методы класса Object
 пишем имя нашего объекта точка затем методы класса Object
 tv.hashCode();

 эти методы относятся к многопоточности
 notify()
 wait()


 Обратите внимание в самом классе TV этих методов нет, эти методы достаются от класса Object
 */
/* Метод toString() возвращает хэш-код для созданного объекта
Хэш-код  - это уникальный номер, присвоенный каждому объекту, если мы создадим ещё один объект класса TV, то хэш-код у него будет другим
Всегда, когда мы вызываем методы print, println, printf  - все эти методы тоже скрыты от нас, обращаются и вызывают метод toString()

Например если написать вот так, это одно и тоже

      System.out.println(tv);
      System.out.println(tv.toString());



Когда мы печатаем объкт, мы скрыто вызываем у этого объекта метод toString(), а этот метод toString(), в свою очередь , он достался этому объекту, этому классу от
предка (класса Object)
 */
/* Если мы хотим чтобы представление в виде строки было другим, то для этого мы можем переопределить метод toString() своим методом toString()
То есть мы можем изменить тот метод , который нам дан предком (классом Object) в своём классе
для этого нам нужно полностью повторить сигнатуру этого метода

    public String toString() - сигнатура, вот эта часть

если сигнатура нашего метода, в нашем классе совпадает с сигнатурой этого метода в классе РОДИТЕЛЯ , то при вызове этого метода на объекте класса TV будет вызываться
метод, который в классе TV, самый конкретный, самый точный, то есть TV у нас в каком-то роде объект , поэтому TV у нас наследуется от Object (объекта) , но TV это более узкое
понятие чем , объект , объект понятие более широкое , то есть все объекты по умолчанию метода toString() имеют в виде хэш-кода , но если мы хотим какой-то точный toString(),
хотим чтобы наш объект воспринимался как-то иначе , то мы должны переопределить этот метод toString() в своём классе, в этом методе мы можем возвратить то, как мы хотим
 чтобы наш объект представлялся в виде строки

 Предназначение метода toString() в том, чтобы представлять объект в виде строки
 */