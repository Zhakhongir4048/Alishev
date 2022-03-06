package OperatorSwitchLesson10;

import java.util.Scanner;

public class SwitchLesson10 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился ");
                break;
            case 7:
                System.out.println("Ты пошёл в школу ");
                break;
            case 18:
                System.out.println("Ты закончил школу ");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло ");
        }

    }
}

// Оператор Switch во многом похож с условным оператором if
/* Оператор Switch используется когда у вас есть много условий
которые вы должны перебрать, вместо того чтобы писать кучу if
 */
/* создадим новую интовую переменную (age)  и в ней будем хранить
всё то , что ввёдем с клавиатуры (число именно)
 */
/* scanner объект который вызывает метод nextInt() вот так выглядит
scanner.nextInt();
 */
/* оператор switch нужен когда у тебя много условий (10, 15, 100  и так далее) */
/* мы будем перебирать условия которые у нас в условии age */
/* внутри тела switch пишется условие*/
/* после каждого кейса мы должны ставить break;
если не будем ставить break; то будут выполняться остальные кейсы  */
/* В switch существует такое слово как default, это условие будет выполняться
когда не выполнился ни один из case'сов , то есть ни одно из предыдущих условий не выполнилось
После default ставить break; не надо
Можем писать default, можно не писать
 */
/* оператор switch работает таким образом
switch (переменная которая может принимать различные значение)
например:
switch (age) {
case 0 :
   System.out.println("salam");
   break;
case 815 :
   System.out.println("Alina")';
   break;
            }               */
/* седьмой java'вой мы можем перебирать String'говую
только в case'сах мы будем проверять строки , а не числа
 */
