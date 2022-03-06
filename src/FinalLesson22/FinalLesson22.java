package FinalLesson22;

public class FinalLesson22 {
    public static void main(String[] args){

        final int sum = 10;
        System.out.println(sum);
    }
}
class Test{
    public static final int CONSTANT = 0;


}
/* Ключевое слово final используется для того, чтобы обозначить переменную, которая не может изменяться
то есть эта переменная получает какое-то значение , если она final мы не можем ёё изменять
final мы обозначаем константу */
/* Все константы в Java пишутся с большой(заглавной) буквы */
/* Не обязательно вашу переменную называть CONSTANT */
/* Мы не можем назначить константе какое-то другое значение
поэтому сеттеры в контексте констант мы создать не можем  */
/* Назначив один раз значение константе в конструкторе,  создавая объект , мы больше не можем назначать
и изменять константу
 */
/* Обычно константы, переменные final  бывают статик static, чтобы она была общей для каждого объекта
и экономили память в компьютере */
/* Помимо того , что мы можем иметь переменные класса константа
мы можем иметь константа переменные метода */