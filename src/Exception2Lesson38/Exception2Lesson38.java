package Exception2Lesson38;

import java.io.IOException;
import java.util.Scanner;

public class Exception2Lesson38 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

     /*   while (true) {
            int x = Integer.parseInt(scanner.nextLine());             // Будем преобразовывать эти строки в целые числа, в примитивы

            if (x != 0) {                                             // Если х не равно нулю

                throw new IOException();                              // Выбрасываем исключение и мы должны в сигнатуре нашего метода добавить throws IOException

            }

        }                          */

        while (true){
            int x = Integer.parseInt(scanner.nextLine());


            if (x != 0){
                try {
                    throw new ScannerException("Пользователь не прав!");                     // ВЫБРАСЫВАЕМ СВОЁ СОЗДАННОЕ ИСКЛЮЧЕНИЕ  `
                } catch (ScannerException e){
                    System.out.println("Пользователь ввёл что-то кроме нуля");
                    break;
                }
            }
        }



    }


}
/*На этом уроке мы научимся выбрасывать исключения
Смоделируем ситуацию, при которой пользователь будет вводить числа в строку, если число отлична от нуля, то мы будем выбрасывать исключения
Предположим, что сценарий, где пользователь ввёл не ноль, предположим что этот сценарий ошибочный, что мы это признаём ошибкой, и хотим обработать это как исключения
*/
/* Если в ходе выполнения метода может произойти выброс исключения , то мы должны либо здесь в сигнатуре метода добавить throws IOException либо мы должны обработать это исключение
в try/catch
while (true){
           int x = Integer.parseInt(scanner.nextLine());             // Будем преобразовывать эти строки в целые числа, в примитивы

            if (x != 0){                                             // Если х не равно нулю
                try {
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
 */
/* Мы вводим ноль, всё нормально, но если мы ввели другое число, то есть не ноль, возникает ошибка программы IOException и останавливается программа */
/* Исключения нужно выбрасывать в том случае, когда в ходе выполнения программы она пришла в то состояние, в которое не должна приходить*/
/* Если нет того исключения которое нам подходит, мы можем создать своё исключение
Создадим отдельный класс и назовём его ScannerException, создано для того, чтобы идентифицировать ошибку в ходе работы с классом Scanner
Унаследуемся от класса Exception , который лежит в пакете java.lang


package Exception2Lesson38;

public class ScannerException extends Exception {

}

Даже в таком виде, мы можем уже выбрасывать исключение
 */
/* Изменим наш Exception так, чтобы при создании объекта исключения он принимал на себя аргумент, когда мы будем выбрасывать исключения, будем передавать описание того, что произошло

package Exception2Lesson38;

public class ScannerException extends Exception {
   public ScannerException(String description){

   }
}
 */