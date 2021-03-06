package NestedClassesLesson43;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();


        Electrocar.Battery battery = new Electrocar.Battery(); // Создаём объект вложенного класса Battery
    }
}
/* В Java мы можем создавать классы практически в любом месте
рядом с публичным классом
внутри публичного класса
внутри методов
В Java есть три типа вложенных класса
Первый тип вложенного класса - это нестатический вложенный класс, они обычно бывают приватными (private class Motor)
Зачем нужны вложенные нестатические классы?
Ответ - объект электрокар он сложенный , он состоит из других объектов (мотор, коробка передач и так далее)
В каждом  вложенном нестатическом классе мы прописываем логику конкретного подобъекта, в данном случае мы прописали логику под объекта мотор
Эти вложенные нестатические классы обычно используются с модификатором доступа private!

Второй тип вложенных классов - это статический вложенный класс
Они обычно бывают публичными
В чём логика статического вложенного класса?
В том , что мы хотим сгруппировать два класса, эти статические вложенные классы используются извне
Логика их связывает


Третий тип вложенных классов когда мы пишем внутри метода, так лучше , можно сказать типо анонимный класс создаём
  */