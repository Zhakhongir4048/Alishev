package ArraysLesson11;

public class ArraysLesson11 {
    public static void main(String[] args) {
        int[] numbers = new int[5];                // numbers -> [array]   // 0 1 2 3 4
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;

        }

        for (int number : numbers) {
            System.out.println(number);
        }

        int[] ints = {1, 2, 3};
        for (int a : ints) {
            System.out.println(a);
        }
    }
}/* Длина массива 5 */
/* По умолчанию элемент массива равняется нулю */
/* Начинается отсчёт с нуля */
/* Все типы данных в Java делятся на 2 типа
а) ссылочные
б) примитивные

Примитивный тип данных можно представить себе как коробку, который может принимать значения

new - ключевое слово, который обозначает что мы создаём новый объект класса

Массив - ссылочный тип данных
 */
