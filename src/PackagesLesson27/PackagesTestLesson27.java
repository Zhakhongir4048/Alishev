package PackagesLesson27;

import PackagesLesson27.something.SomeClass;

import java.util.Scanner;

public class PackagesTestLesson27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SomeClass someClass = new SomeClass();
        Tree tree = new Tree();
        Squirell squirell = new Squirell();
    }
}
/* Пакеты используются для того, чтобы логически группировать различные классы , то есть в больших проектах существует много классов и вам просто будет неудобно если
все классы будут лежать в одной папке , в папке src, для того чтобы разграничить вы используете пакеты
Пакет и папка - это синонимы
У нас появляется name space - пространство имён , это значит , что мы можем создать в папке src класс Tree и при этом у нас не будет возникать коллизии имён  , у нас разрешено
иметь одинаковые названия классов в разных папках
Если мы хотим использовать наши классы из папки forestLesson27 в классе который находится в папке src нужно первой строчкой импортировать эту папку, вот так

import forestLesson27.*;


import java.util.Scanner; - из этой строчки можно понять, что класс Scanner лежит в пакете java внутри этого пакета java лежит пакет util , внутри пакета util лежит класс Scanner
То есть в библиотеке Java всё разделено по пакетам и каждый пакет отвечает за своё , в пакете util содержатся многие классы , которые утилитарные , полезные , если мы не
импортируем класс из этого пакета, то будет ошибка и предложение импортировать этот класс

Пакеты имеют иерархическую природу внутри пакета forestLesson27 создадим ещё пакет, теперь в пакете something создадим класс SomeClass
Чтобы использовать этот класс нам нужно импортировать правильно, разделители папок это точки

НО чтобы полностью импортировать папку лучше всего поставь *
import forestLesson27.*;
import java.util.*; - импортирует все классы из папки util

import forestLesson27.something.SomeClass; Это для того чтобы использовать классы в этой папке

В Библиотеке Java всё распределено по пакетам
Смотри и вчитывайся в ошибки-это очень полезно !
 */