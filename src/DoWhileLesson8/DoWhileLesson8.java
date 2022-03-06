package DoWhileLesson8;

import java.util.Scanner;
public class DoWhileLesson8 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5 ");
            value = scanner.nextInt();
        }  while (value != 5);
        System.out.println("Вы ввели 5 ");
    }
}
/* int d = dzhoha.nextInt(); в цикле do while
не пиши внутри цикла, будет ошибка, потому, что когда мы декларируем переменную, она видна лишь в пределах
скобок, while не видит d, так как d находится внутри скобок, а не за пределы
 */
/* цикл  do while отличается от цикла while тем, что
do while выполняет впервую очередь как минимум одну инструкцию, а потом проверяет только условие,
а while сначала проверяет условие , только затем выполняется оно или нет зависит от условия  */
/* на этом уроке мы будем писать программу, которая будет считывать цифры с клавиатуры
пока не будет введена цифра 5
 */
/* создаём обычный цикл while и он будет крутиться до тех пор, пока переменная a не достигнет цифры 5
то есть, если мы введём цифру 5, цикл завершится
 */
/* в программе не должно быть дублирование кода, избегай этого, из-за этого есть цикл do... while
 например вот так не делай
 public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введи 5");
        int z = d.nextInt();
        while (z != 5){
            System.out.println("Введи 5");
            z = d.nextInt();
        }
        System.out.println("Вы ввели 5");
    }                                        */