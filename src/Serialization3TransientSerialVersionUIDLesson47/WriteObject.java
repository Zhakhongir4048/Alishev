package Serialization3TransientSerialVersionUIDLesson47;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObject { // В этом классе мы будем записывать объекты в файл
    public static void main(String[] args) {

        Person person1 = new Person(1, "Mike");


        // Расширение файла может быть любым, мы можем оставить и вовсе без расширения
        try (FileOutputStream fos = new FileOutputStream("people.bin"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}