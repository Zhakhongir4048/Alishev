package ExceptionLesson40;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionLesson40 {
    public static void main(String[] args)  {

        try {
            run();
        } catch (IOException  | ParseException exception ) {    // мульти catch, вместо того, чтобы иметь несколько catch блоков, все ислючения хотим обрабатывать одинаково
            exception.printStackTrace();
        }


        try {
            run();
        } catch (Exception e) {             // После него catch блоки нет смысла писать, которые наследуются от класса Exception, только Error можно

        }

    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
/* Из одного метода можно выбрасывать сколько угодно исключений, этот метод может выбрасывать сколько угодно исключений, их может быть любое количество
Когда будете вызывать этот метод из другого метода, вам нужно либо обработать эти исключения(try/catch), либо выбросить дальше (throws IOException, IllegalAccessException)

    public static void run() throws IOException, FileNotFoundException, IllegalAccessException {

    }
 */
/* Мы каждое исключение можем захотеть обрабатывать по разному*/