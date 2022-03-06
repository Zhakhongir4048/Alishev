package EqualsAndStringPoolLesson42;


public class EqualsAndStringPoolLesson42 {
    public static void main(String[] args) {
        String string1 = "Hello";                  // string1 и string2 ->  {"Hello"}
        String string2 = "Hello";

        System.out.println(string1.equals(string2));        // Будет true
        System.out.println(string1 == string2);             // Будет тоже true , так как в Java есть StringPool , обе ссылки указывают на одну и тоже строку
        // Указатель указывает на какой-то участок в памяти

        //     animal1    ->         {1}         Первый объект класса Animal   animal1 - это указатель
        //     animal2    ->         {1}         Второй объект класса Animal   animal2 - это указатель
        int a = 1;
        int b = 1;
        System.out.println(a == b);        // Сравниваем примитивы, будет возвращено true // Все примитивы в Java можем так сравнивать


        Animal animal1 = new Animal(1);      // Эти объекты хранятся в разных участках памяти на компьютере! От того что, они одинаковые не имеет роли
        Animal animal2 = new Animal(1);


        System.out.println(animal1 == animal2);      // ТАК НЕЛЬЗЯ СРАВНИВАТЬ!  ТАК КАК СРАВНИВАЕТ ССЫЛКИ ОБЪЕКТОВ , НО НЕ САМИ ОБЪЕКТЫ

        System.out.println(animal1.equals(animal2));    // Будет true , так как мы переопределили метод под себя

      /*

        public boolean equals(Object obj) {         подаётся в аргумент тот объект, с которым  сравнивается текущий объект
        return (this == obj);                       возвращается вот такое сравнение, текущий объект сравнивается с объектом поступившим в качестве аргумента
    }


          */
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object object) {             // Переопределяем метод // Обязательно в сигнатруру метода пишем Object
        return this.id == ((Animal) object).id;
    }
}
/* Научимся сравнивать объекты между собой
Что нам делать если мы хотим сравнить объекты структурно, а не хотим сравнивать их указатели, для этого в Java есть метод equals
Метод equals определён в классе Object
Метод equals используй всегда , если хотите сравнивать объекты по их структуре
Еслм вам нужно сравнить объекты как ссылки,  если вам нужно узнать , что две ссылки указывают на один и тот же объект тогда используй вот такую способ сравнения

System.out.println(animal1 == animal2);      // ТАК НЕЛЬЗЯ СРАВНИВАТЬ!  ТАК КАК СРАВНИВАЕТ ССЫЛКИ ОБЪЕКТОВ , НО НЕ САМИ ОБЪЕКТЫ

Метод equals используй при сравнении строк


StringPool - это такой пул всех строк в Java, когда вы первый раз создаёте строку "Hello" она помещается в пул
 */