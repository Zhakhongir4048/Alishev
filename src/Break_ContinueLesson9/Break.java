package Break_ContinueLesson9;

public class Break {
    // Разбираем оператор break;
    public static void main(String[] args) {
        int i  = 0;
        while (true){
            if (i == 15)
            {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");
    }
}
// оператор Break и Continue используются вместе с циклами
/* оператор break используется для выхода из цикла, если вы вызываете его внутри цикла,
он немедленно обрывает его */
/* while (true) - это бесконечный цикл*/
// условие if (если)
/* if ( a == 15) {
     break;
  }            если a будет равен 15 , бесконечный цикл завершается
 */
/* 15 не вывелось на экран, цикл досчитал до 15*/

