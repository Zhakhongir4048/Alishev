package Serialization1Lesson45;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {  // В этом классе мы будем считывать объекты из файла, в котором будут лежать эти объекты
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject(); // Downcasting надо сделать

            System.out.println(person1);
            System.out.println(person2);

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) { // Это исключение может возникнуть в том случае, если мы записали в наш файл people.bin объекты класса Person
            e.printStackTrace();             // и отправили нашему другу по почте, он его открыл, но в его проекте нету класса Person, в этом случае
                                             // если он будет считывать данные из нашего файла people.bin и будет их приравнивать к какому-то своему классу
                                             // то возникнет ошибка, у нашего друга этого класса может не быть, в том случае, когда в проекте нет того класса,
                                             // объекты которого записаны в файле возникнет ошибка ClassNotFoundException
        }
    }
}
