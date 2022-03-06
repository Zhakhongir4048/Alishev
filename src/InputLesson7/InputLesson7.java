package InputLesson7;

import java.util.Scanner;

public class InputLesson7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string = scanner.nextLine();
        System.out.println("Вы ввели " + string);

        int i = scanner.nextInt();
        System.out.println("Ввели число " + i);
    }
}
/* У класса Scanner есть много своих методов
1) scanner.nextLine(); - считывание строки одной
2) scanner.nextInt(): - считывание цифр
 */
/* class String заранее импортирован, а class Scanner нет, его нужно импортировать самому
Класс String лежит в пакете java.lang (все классы импортируются заранее)
Класс Scanner лежит в пакете java.util (все классы не импортируются заранее, надо самим)
 */
/* class String отличается от других классов в java
Мы можем создавать объект класса String вот так String z = "face";
Остальные объекты классов создаются другим способом
 */
/* new - это ключевое слово , которое обозначает создание нового объекта класса
String x = new String("face"); в параметрах задаём конкретную строку
 */
/* класс Scanner отвечает за ввод данных с консоли, то есть за получение данных с пользователя */
/* Scanner dzhoha = new Scanner(System.in);
Scanner dzhoha(тут можно любое слово написать с маленькой буквы) = new Scanner(System.in - отвечает за считывание с клавиатуры)
 */
/* В параметры, в конструктор Scanner мы должны задать входной поток (System.in)*/