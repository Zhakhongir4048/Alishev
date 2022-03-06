package RecursionLesson49;

public class RecursionLesson49 {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }

    // counter(3)  -> counter(2) -> counter(1) тройка ждёт пока выполнится двойка, а двойка ждёт пока выполнится однёрка
    /*
    counter(3)
    counter(2)
    counter(1)
    counter(0)   когда последний вызов метода выполнится, мы начинаем подниматься  по цепочке вызовов метода
     */

    private static void counter(int n) { // Мы хотим без цикла, с помощью рекурсии отсчитать от числа n до числа единиц\
        if (n == 0) return;


        System.out.println(n);
        counter(n - 1);     // 3 , 2, 1
    }


    /* fac(4)
    4 * 6 = 24
    3 * 2 = 6
    2 * 1 = 2
     */

    private static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);       // факториал
    }

 /* private static void someMethod() {
        System.out.println("Hello!");
        someMethod();         // Мы никогда не выйдем из этого метода, возникает ошибка StackOverflowError
                              // Однажды зайдя в него, мы никогда его не исполним, потому,что в конце этого метода есть вызов этого же метода
    }                                                                                                                                                                 */

}
/* Рекурсией называется вызов метода в теле этого же метода

В чём заключается ошибка StackOverflowError , дело в том, что в Java информация о вызовах метода хранится в специальном участке памяти, которая называется Stack
И в этом участке памяти хранится вот такой огромный массив наших вызовов метода
someMethod() -> someMethod() -> someMethod() и так без конца
Естественно размер Stack'a ограничен, то есть памяти выделяемым под Stack ограниченное количество, поэтому рано или поздно Stack переполнился
И появилась ошибка StackOverflowError из-за того, что мы бесконечно вызывали метод someMethod()
Чтобы такого не происходило, чтобы рекурсия была полезкой нужно условие выхода

*/