package Serialization3TransientSerialVersionUIDLesson47;

public class Serialization3TransientSerialVersionUIDLesson47 {
    public static void main(String[] args) {

    }
}
/*  Ключевое слово transient  - это ключевое слово используется тогда , когда мы не хотим сериализовывать какое-то поле
Предположим, что у нашего объекта класса Person, у всех объектов класса Person мы не хотим сериализовывать поле name
В реальной жизни это может быть какое-то поле, которое например техническое и оно неважно для нас, мы его не хотим хранить у себя в файле, не хотим тратить память и
поэтому мы не хотим его сериализовывать, чтобы  не сериализовывать это поле, мы можем указать ключевое слово transient
И так как String у нас ссылочный тип, ссылочные типы, когда в них ничего не находится, когда они ни на что не ссылаются , они по умолчанию ссылаются на null
Поле id - это примитивный тип , когда мы пишем transient с примитивными типами мы получаем следующее
0 : Mike
 */
/* Поле SerialVersionUID
Предположим мы записали объекты в файл в 2017 году и прошло 5 лет, всё это время этот файл лежал на жестком диске, где нибудь на полке
Мы знали что там лежит, в этом файле, объект класса Person
Предположим, что за это время над проектом работали люди и над классом Person тоже работали люди, и здесь много всего поменялось(добавили много полей)
То есть изменения внесли в этот класс
Теперь через 5 лет мы хотим считать записанный объект класса Person
Дело в том, что мы записали один объект класса Person, то есть класс Person в то время был другим когда мы записывали этот объект и за это время класс Person поменялся
и теперь, когда мы считаем объект класса Person мы можем получить какие-то непредвиденные вещи, естественно мы их получим, потому, что классы не одинаковые, и соответственно
объекты этих классов тоже неодинаковые, поэтому , мы здесь не можем просто взять  и нашему новому классу Person присвоить объект того старого класса Person, который был там
5 лет назад , для этого мы используем вот это поле  SerialVersionUID, он нужен для того , чтобы помечать состояние класса
Когда ты меняешь состояние класса, то и меняется поле SerialVersionUID
 */
/* Когда мы используем try/with/ resources, то автоматически поток(-и) закрываются*/