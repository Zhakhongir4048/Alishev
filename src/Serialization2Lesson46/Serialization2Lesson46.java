package Serialization2Lesson46;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization2Lesson46 {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);  // длина массива


            for (Person person : people) {
                oos.writeObject(person);   // записываем каждый объект в файл
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
/*Будем записывать массив из объектов в файл
В этом случае нам требуется записывать не объекты по отдельности, а целиком массив в файл
Есть 2 способа записать
1) записываем в файл сначала целое число, для этого используем метод writeInt(длина массива)
Пример

oos.writeInt(people.length);  // длина массива

Теперь у нас в файле записана длина массива
Дальше в этот массив,  мы можем один за другим записывать объекты
Для этого мы пройдёмся по массиву с помощью цикла for each
После выполнения этого кода, в нашем файле будет сначала число записана, число объектов в массиве,  и затем будет записана это число объектов класса Person
Теперь в классе ReadObject мы можем считать все элементы массива, для этого мы считываем число, которое идёт в самом начале, которое мы записали, это то число,
которое мы ожидаем получить из файла, то число объектов класса Person, для этого мы вызываем метод readInt();
Считаем и запишем в переменную


2) oos.writeObject(people) и всё
Person[] people = (Person) ois.readObject();
 */