package VariablesLesson2;

public class VariablesLesson2 {
    public static void main(String[] args)
    {

        // 8 примитивных типов данных

        int myInt = 44;              // 32 битное число
        short myShort = 3266;        // 16 битное число вмещает от - 32000 до +32000
        long  myLong = 23244432;     // 64 битное информацию вмещает в себя, хранит тоже целые числа

        double myDouble = 232.32;    // вещественный тип данных, который хранит в себе 64 битную информацию
        float myFloat = 3433.2f;     /* вещественный тип данных, который хранит в себе 32 битную информацию
                                       в Java всегда по умолчанию double из-за этого пишем букву f */

        char myChar = 's';           // тип данных, представляет из себя символ, букву, символ пишем в одинарных ковычках

        boolean d = true;            // логический тип данных, оно либо true либо false
        byte myByte = 56;            // тип данных , который вмещает себе 8 бит , либо 1 байт , цифры от -128 до 127
        System.out.println(myInt);
    }

}
/* Переменную можно воспринимать как коробку, в которой можно хранить какое-то значение
Переменную чтобы использовать: надо сначала задекларировать , затем инициализировать
Тип переменной имя переменной
 */