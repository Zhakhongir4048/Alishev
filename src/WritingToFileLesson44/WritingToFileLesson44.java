package WritingToFileLesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFileLesson44 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);// С помощью этого класса будем писать в файл

        pw.println("Test row 1"); // Действует как System.out.println();
        pw.println("Test row 2");

        pw.close();
    }

}
