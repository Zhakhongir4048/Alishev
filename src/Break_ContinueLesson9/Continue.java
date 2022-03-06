package Break_ContinueLesson9;

public class Continue {
    // Разбираем оператор continue;
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0){
                continue;     // true чётные числа пропускает оператор continue
            }
            System.out.println("Это нечётное число " + i);
        }

    }
}
// помещаем условие if
// i % 2 == 0 - это остаток от деления 0, чётные числа так вычисляем
/* когда оператор continue выполняется в цикле, всё что следует после
оператора continue не выполняется
оператор continue просто ещё раз инкрементирует переменную счётчик
 */
/* if (i % 2 == 0){
                continue;     // true , чётные числа пропускает оператор continue
            }
  например i = 1 , if у нас теперь false , выполняется следующая команда
   System.out.println("Это нечётное число " + i);
 */

