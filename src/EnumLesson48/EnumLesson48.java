package EnumLesson48;


public class EnumLesson48 {

    public static void main(String[] args) {
        Animal animal = Animal.DOG;              // переменная CAT ведёт себя как статическая переменная , то есть мы получаем к ней доступ через имя инама
                                                 // только из инама мы можем в переменную типа Animal положить, здесь могут быть только животные

        System.out.println(animal.toString());             // Выводится строковое представление нашего объекта CAT
        switch (animal) {
            case CAT -> {
                System.out.println("Ii's a cat!");
            }
            case DOG -> {
                System.out.println("It,s a dog!");
            }
            case FROG -> {
                System.out.println("It's a frog!");
            }

        }


        Season season = Season.SUMMER;               // Названия инама в единственном числе обычно

        /* Иерерхия наследования , которая существует в каждом инаме

           Object ->  Enum -> Season

         От класса Object наследуется Enum , а от Enum наследуется созданный нами инам (Season в нашем случае, наследует от Enuma некоторые методы, которые нужны для перечисления)

         */

        switch (season) {
            case SUMMER -> {
                System.out.println("It's warm outside!");
            }
            case WINTER -> {
                System.out.println("It's cold outside!");
            }

        }

        System.out.println(season instanceof Season);        // ключевое слово instanceof проверяет, является ли объект объектом этого класса
        System.out.println(season instanceof Enum);          // в Java объект является не только объектом своего класса, но и является объектом всех родителей этого класса
        System.out.println(season.getClass());               // этот метод у нас определён в классе Object, вызванный на объекте, он даёт нам тот класс, объект которого этот
                                                             // объект является

    }

}
/* Enum (enumeration) - по-русски (перечисления), используется тогда, когда нам нужно перечислить типы объекта , например у нас есть времена года , типы животных , страны и мы
хотим их перечислить в своей программе и использовать
Если в программе требуется для выполнения  временя года , то мы можем создать enum время года и там перечислить зима, лето , осень, весна
Если программа работает со странами, ведёт какую-ту библиотеку или какую-ту базу данных со странами , то мы можем создать enum страна и там перечислить все страны



До появления enum

Будем представлять животных как целые числа, зададим что собака это ноль , кошка это единица, лягушка это двойка
Теперь у нас в программе есть перечисления животных

public class EnumLesson48 {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;


    public static void main(String[] args) {
        int animal = DOG;

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It' a frog");
                break;
            case CAT:
                System.out.println("It' a cat");
                break;
            default:
                System.out.println("It's not an animal");
        }
    }

}
 */
/* При создании инама у нас ключевое слово enum
После того как мы создали инам мы можем в ней перечислить все необходимые животные, которые мы хотим использовать в программе


public enum Animal {

      DOG, CAT, FROG
}

Мы дали понять, что есть такой тип Animal в программе, и у нас есть объекты этого типа (Собака, кошка и лягушка)
Теперь в нашей программе мы можем использовать этот инам , для этого мы пишем

Animal animal = Animal.CAT;          // выбираем нужное животное

 */
/* Здесь мы создали тип Animal,  и в переменную типа Animal мы не можем поместить что-то находящееся вне этого типа, мы можем туда поместить только DOG, CAT, FROG
Когда мы пишем наши перечисления в инаме , Java сама создаёт объект этого инама
 */
