package StringLesson3;

public class StringLesson3 {

    public static void main(String[] args)
    {
        int d = 6;
        String a = "My love";  // My love - это конкретный объект
        String space = " ";
        String name = "Dzhoha";       // Dzhoha - это конкретный объект
        System.out.println("John" + " " + "Dima");
        System.out.println(a+space+name);
        System.out.println(a+d);
    }


}
/* Все примитивные типы данных хранят в себе какое-то значение */
/* Типы данных бывают примитивные и ссылочные  (String-ссылочный тип данных) */
/* Имя String может быть любым
String пишется с большой буквы потому, что является классом
Классы пишутся всегда с большой буквы */
/* Класс-это нечто неконкретное, класс не имеет общего с конкретным объектом материально */
/* Отличие класса от объекта , допустим класс какая-то схема/чертёж,
а объект это то, что было построено руководствуясь этим чертежом
Например построили машину руководствуясь этим чертежом
в машину мы можем сесть, материально потрогать, конкретная единица
Класс- это указание как нам создавать объекты
Объект-штука материальная
Класс- штука нематериальная */
/*String -это какая-то строка, а My love (объект конкретный) */
/* Ссылочные типы данных они ссылают ; переменная s класса String ссылается на объект класса String  */