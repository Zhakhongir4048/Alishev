package CastingOfPrimitiveDataTypesLesson30;

public class    CastingOfPrimitiveDataTypesLesson30 {
    public static void main(String[] args) {
        int a = 123;
        double x = a;     /* неявное конвертирование, так как double(64 бита) мощнее int(32 бита) , double описывает вещественные числа
                      123 - это вещественное число , все целые числа, они являются вещественными*/
        System.out.println(x);        // Вывод 123.0 , так как все целые числа мы можем представить в виде вещественных чисел
        double d = 123.6;
        int ints = (int) d;
        System.out.println(ints);

        long l =  Math.round(d);   // long на выходе получаем
        System.out.println(l) ;

    }
}
/*
byte хранит в себе целое число  8 бита (1 байт)  от -128 до 127
short хранит  в себе целое число 16 бита (2 байта)
int хранит в себе целое число 32 бита (4 байта)
long хранит в себе целое число 64 бита (8 байта)
float хранит в себе вещественное число 32 бита (4 байта)
double хранит в себе вещественное число 64 бита (8 байта)
boolean хранит в себе логическое выражение true или false 8 бита (1 байт)
char хранит в себе символы Unicode 2 байта (16 бит) значения больше 0
 */
/* Примитивные типы как коробка, хранят в себе значения и никуда не ссылаются */
/* У нас есть ситуация, когда у нас 2 примитивных типа и мы один хотим преобразовать в другой */
/* float f = 123.2; ошибка , говорит что несовместимы типы
Дело в том, что все цифры с точкой в Java по умолчанию  типа double
Мы не можем присвоить значение double переменной типа float просто так */
/* если типу long присвоить значение 123 будет всё работать нормально, а если присвоить большое число возникнет ошибка
из-за этого в конце пишем L , так как по умолчанию целое число в Java - это  int
 */
/* Сконвертируем long в int
предположим у нас есть
int x
и long l , мы знаем что long слишком большой для типа int
 Попробуем сконвертировать long в int */
/* из int в long мы конвертировать можем , однако из long в int нельзя
* ПОЧЕМУ?
Потому, что у нас приведение типов бывают явными и неявными !
        long l = a;    // неявное приведение, то есть оно делается за нас!
        int x = (int) l;      //  явное приведение, не делается за нас!  если мы хотим чтобы приведение было нам нужно указать самим
        * потому, что long в 2 раза больше int, можно для себя уяснить , что long в 2 раза сильнее, шире или мощнее , чем int
        * всё , что является int можем быть и long'ом , любое число которое помещается в int , оно точно поместится в long
        * а long не поместится в int , Java не делает за нас конвертацию, она хочет чтобы мы сами указали , что действительно хотим  long
        * сконвертировать в int
        * Мы понимаем на что идём , что мы точно знаем , что в переменную типа long не будет слишком большого числа для переменной типа int
        * то мы пишем явное приведение типа int x = (int) l;
*/
/* Ещё такие же примеры существуют для double и float
Ты можешь вот так сконверитровать double во float
1) float f = (float) 123.2;
2) float f =  123.2F;
  */

/*
 float f = (float) 123.2;

    int a = 123;
    long l = a;                 // неявное приведение , делается за нас , конвертация происходит сама по себе
    int x = (int) l;            // явное  приведение , не делается за нас , а здесь наоборот, Java не конвертирует тут за нас
    System.out.println(x);
 */
/* перевести double в int мы не можем неявно
потому , что если у нас есть double x = 123.5; то мы не сможем неявно перевести это число  в int , если мы переведем double в int мы рискуем потерять вещественную часть
надо явно перевести double в int
Пример
double x = 123.5;
int y = (int) x;
System.out.println(y);

Вывод 123

Здесь вещественная часть убирается
 */
/* Если мы хотим округлить вещественную часть числа  то есть округлить число мы можем использовать статический метод класса Math round
Math.round(x);
 */
