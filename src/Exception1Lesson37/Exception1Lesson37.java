package Exception1Lesson37;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class  Exception1Lesson37  {
    public static void main(String[] args) {
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);

            System.out.println("после Scanner'a");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try catch");

        try {
            readFile();                                         // Мы должны обработать это исключение , обработка исключения  делегируется вверх, по иерархии вызова метода
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
    }

    // Метод чтения файла
    public  static void readFile() throws FileNotFoundException {  // Обработали исключение с помощью throws
        File file = new File("tea");                     // Где бы мы этот метод не вызывали, наше исключение выбросится там , где будешь вызывать
        Scanner scanner = new Scanner(file);
    }


}
/* Для обработки случаев, когда в ходе выполнения программы может возникнуть ошибка были придуманы исключения
Исключения - обычный объект класса, просто все классы , которые у нас обозначают исключения, они должны наследоваться от класса Exception
Класс FileNotFoundException - это класс, который наследуется от класса Exception, его объект выбрасывается в том случае, если происходит ошибка
Почему у нас возникает ошибка? ПОТОМУ , ЧТО МЫ ДОЛЖНЫ ОБРАБОТАТЬ ТОТ СЦЕНАРИЙ  , ПРИ КОТОРОМ ЭТОТ ФАЙЛ НЕ СУЩЕСТВУЕТ

есть 2 варианта тут
1) означает , что этот метод возможно выбросит вот такое исключение, мы даём понять Java , что в ходе выполнения кода , находящееся в этом методе может возникнуть такая ошибка
Таким образом мы можем обрабатывать исключения, просто добавляя throws в метод, когда это исключение будет появляться, выбрасываться у нас будет красный текст , говорящий об ошибке

public class Exception1Lesson37 {
    public static void main(String[] args) throws FileNotFoundException {

    }
}


2) мы вместо того, чтобы выбрасывать красный текст , можем сами обработать исключения, и для этого служит try / catch блок
Весь код, который может вызвать исключение находится в блоке try, обработка исключения находится в блоке catch, то есть try ( с перевода на английский - попытаться)
Мы пытаемся выполнить эту часть кода и надеемся что исключение не будет выброшено , если всё же они выброшены , то их обрабатываем в блоке catch, у блока catch есть объект
класса FileNotFoundException, это тот самый объект, который выброшен в результате некорректного выполнения этого кода
По умолчанию мы у этого объекта просто вызываем  метод  e.printStackTrace(); , если запустим программу , мы увидим тоже самое , что и в первом примере
ТО есть метод printStackTrace(); выводит сообщение об ошибке
В catch блоке мы можем реализовать свой метод обработки исключения
Пример

public class Exception1Lesson37 {
    public static void main(String[] args) {
        File file = new File("asads");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
В случае если файл не найден,  то выведется надпись в консоль
 */
/* Если мы запустим нашу программы, то появится эта ошибка

C:\Users\79998\Downloads\openjdk-16_windows-x64_bin\jdk-16\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.3\lib\idea_rt.jar=57478:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\79998\Desktop\Alishev\out\production\Alishev Exception1Lesson37.Exception1Lesson37
Exception in thread "main" java.io.FileNotFoundException: asads (Не удается найти указанный файл)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
	at java.base/java.util.Scanner.<init>(Scanner.java:639)
	at Exception1Lesson37.Exception1Lesson37.main(Exception1Lesson37.java:11)          // ЗДЕСЬ МЫ ВИДИМ НА КАКОЙ СТРОЧКЕ ВОЗНИКЛА ОШИБКА!

 */
/* После блока try/catch  выполняется код  как обычно , мы можем после блока вывести текст например, мы можем продолжать корректно выполнять программу
ПРИ УСЛОВИИ ЕСЛИ МЫ ОБРАБОТАЛИ ИСКЛЮЧЕНИЕ КОД ДАЛЬШЕ КОРРЕКТНО ВЫПОЛНЯЕТСЯ
package Exception1Lesson37;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1Lesson37 {
    public static void main(String[] args) {
        File file = new File("asads");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try catch");
    }
}

 */
/*  Если у нас ислючение выбрасывается в блоке try, в блоке try прекращается работа после выбрасывания исключения, и сразу переходит в блок catch
Если мы в корне проекта создали файл, и используем этот файл, то исключение в блоке try не будет выброшено и обработает этот блок до конца
 */
/* когда мы вызываем со своего метода другой метод, мы можем обработать исключение , где высветится ошибка с красным текстом, либо поместить в блок try/catch , поймать эти
исключения*/
/* StackTrace  - вот этот красный текст, который мы видели в начале , ЭТО ОЧЕНЬ НЕ ХОРОШО , ЕСЛИ ОНА У ВАС ПОЯВЛЯЕТСЯ, ПОТОМУ, ЧТО ВСЕ ИСКЛЮЧЕНИЯ ПО ВОЗМОЖНОСТИ НУЖНО
ОБРАБАТЫВАТЬ ИНДИВИДУАЛЬНО , ЕСЛИ КРАСНЫЙ ТЕКСТ ПОЯВИЛСЯ, ТО ЭТО ЗНАЧИТ ГДЕ-ТО ВЫБРОСИЛИ ИСКЛЮЧЕНИЕ ВОТ ТАКИМ ОБРАЗОМ (throws) ИЛИ ПОНАДЕЯЛИСЬ НА ОБРАБОТКУ ИСКЛЮЧЕНИЯ
ПО УМОЛЧАНИЮ (e.printStackTrace();)  И НЕ ОБРАБОТАЛИ ИСКЛЮЧЕНИЕ ДОЛЖНЫМ ОБРАЗОМ
Хорошо обрабатывать исключения таким образом, что пользователю вашего кода было понятно и не страшно , потому , что этот красный текст , который появляется , он довольно
устрашающе выглядит , вы должны обрабатывать исключения таким образом, чтобы был человекочитаемым и дружелюбный текст , который указывал на ошибку и её причину*/