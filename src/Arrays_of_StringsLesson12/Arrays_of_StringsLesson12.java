package Arrays_of_StringsLesson12;

public class Arrays_of_StringsLesson12 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();

        for (String string : strings){       // Тип данных создаём,переменная этого типа : имя переменной, через которое хотим проходить
            System.out.println(string);
        }

        int[] numbers1 = {1,2,3,};
        int sum = 0;
        for (int x : numbers1){             // Тип данных создаём,переменная этого типа : имя переменной, через которое хотим пройти
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;                   // МЫ НЕ ЗНАЕМ СКОЛЬКО БУДЕТ ЗАНИМАТЬ СТРОКА, ОНА МОЖЕТ СОСТОЯТЬ ИЗ 5 БУКВ , МОЖЕТ СОСТОЯТЬ ИЗ 1000 БУКВ
        System.out.println(s);             // МЫ ВЫДЕЛЯЕМ ПАМЯТЬ ТОЛЬКО ПОД ССЫЛКУ
    }
}
/* NULL - ЭТО ПУСТОТА
/* цикл for each используется для того, чтобы проходиться по массивам, по любому структуры данных.
с массивами из строк всё обстоит также */
/* цикл for each переводится с английского "для каждого"
проходится по всем элементам массива последовательно, внутри этого цикла вы
с каждым элементом можете делать что-то, с массивами и с другими структурами данных удобно использовать
 */
/* все примитивные типы данных с маленькой буквы пишутся
а ссылочные типы данных , так как они являются классами пишутся с большой буквы!
 */
/* String[] w = new String[3]; - создали массив из строк, этот массив
может вместить в себя 3 объекта класса String
объект класса String - это какая-то строка
 */
/* for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
   цикл for будет проходиться по каждому индексу массива w
 */
                                                /* мы создаём цикл for each
                                                1) пишем for
                                                2) открываем условие:
                                                a) создаём тип данных и имя переменной
                                                который будет использоваться в цикле (имя переменной может быть любым)
                                                b) ставим двоеточие :
                                                с) обращаемся к массиву
                                                 */
/*  for (String e : w) {
            System.out.println(e);
        }
       тут мы создали цикл for each
       создали тип данных и переменную к нему,
       присвоив имя к нему, поставили двоеточие и
       обратились к имени переменной массива
       затем  вывели значение массивов, к которой обращались
       через System.out.println(e);
 */