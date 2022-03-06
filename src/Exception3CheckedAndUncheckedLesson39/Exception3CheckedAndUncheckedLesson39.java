package Exception3CheckedAndUncheckedLesson39;

public class Exception3CheckedAndUncheckedLesson39 {
    public static void main(String[] args)  {
     String name = null;                        // NullPointerException ,  в вашей переменной лежит нулл
            name.length();                      // Обрабатывать не нужно, но если в ходе выполнения программы дойдём до этой строки, то появится ошибка NullPointerException

     int[] arr = new int[2];
        System.out.println(arr[2]);            // Появится ошибка ArrayIndexOutOfBoundsException() , обозначает, что вышли за пределы массива

    }
}
/* В Java все исключения делятся на два больших типа:
Checked                // Проверенный, проверяемые , те исключения которые возникают во время компиляции // исключительные случаи в работе программы
Unchecked              // Те исключения, которые возникают во время выполнения программы    // ошибка в работе программы

 */
/* Это checked исключение, потому, что эти исключения вам нужно обязательно обработать, без обработки этих исключений ваша программа не скомпилируется
package Exception3CheckedAndUncheckedLesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3CheckedAndUncheckedLesson39 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
 */
/* Это unchecked исключения, оно появляется в ходе выполнения программы, Java не обязывает вас обрабатывать эти исключения
public class Exception3CheckedAndUncheckedLesson39 {
    public static void main(String[] args) throws FileNotFoundException {
       int a = 1 / 0;
    }
}
 */
/* Все checked исключения(которые требуют обработки до компиляции) наследуются от класса Throwable */