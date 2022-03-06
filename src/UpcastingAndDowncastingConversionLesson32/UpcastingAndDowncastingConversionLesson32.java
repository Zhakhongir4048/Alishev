package UpcastingAndDowncastingConversionLesson32;

public class UpcastingAndDowncastingConversionLesson32 {
    public static void main(String[] args) {
        // Upcasting - Восходящее преобразование
        Animal animal = new Dog();


        // Тоже восходящее преобразование, восходящее преобразование происходит неявно
        Dog dog = new Dog();
        Animal animal1 = dog;


        // DownCasting - Нисходящее преобразование
        Dog dog1 = (Dog) animal1;
        dog1.bark();


        Animal animal4 = new Animal();
        Dog dog4 = (Dog) animal4;
        dog4.bark();
    }
}
/*
Animal animal = new Dog();
Почему тут восходящее преобразование, потому , что класс Dog наследуется от Animal , то есть в иерархии наследования он стоит ниже класса Animal
Мы объект воспринимаем как его родителя, мы объект рассматриваем как его родителя , восходящее преобразование совершаем от наследника к родителю
Так как Dog рассматриваем как Animal

Восходящее преобразование происходит неявно , в отличие от нисходящего преобразования , которое придётся нам делать самим вручную
Сделаем нисходящее преобразования от родителя к потомку

Dog dog = (Dog) animal;

Таким образом мы получили из животного собаки , то есть спустились ниже по иерархии наследования
DownCasting не всегда безопасен
Восходящее преобразование всегда безопасна


Вот эти преобразования не меняют сам объект , они меняют ссылку на этот объект

Animal animal = new Animal();
Dog dog = (Dog) animal;                            - будет ошибка компиляции , если будем вызывать методы класса dog , нисходящее преобразование не всегда безопасна


Dog dog = new Dog();
Animal animal = dog;
Dog dog = (Dog) animal;                   - здесь не будет опасно

 */
