package SetAndGetIncapsulationLesson18;

public class SetAndGetIncapsulationLesson18 {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setName("Aplle");
        phone.setAge(1_000_000_000);

        phone.getName();
        phone.getAge();

        System.out.println("Выводим значение в main методе: " + phone.getName());
        System.out.println("Выводим значение в main методе: " + phone.getAge());

        /* с помощью геттеров , мы вывели значение в методе main , в другом классе
          в классе SetAndGetIncapsulationLesson18 */

        // К функционалу программы пользователь получает через API
    }

}
class Phone{
    private String name;              // Эти поля должны быть скрыты от пользователя , делаем их private
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()) {                          // метод isEmpty(), это метод класса String, возвращает true если строка пустая
            System.out.println("Ты ввёл пустое имя");      // false если строка не пустая
        }
        else {
            name = userName;
        }
    }



    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Возраст должен быть положительным");
        } else{
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }


    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void sayHello()
    {
        System.out.println("Привет!");
    }

    void speak()
    {
        System.out.println("Меня зовут " + name + " меня выбирают " + age + " пользователей ");
    }
}
/* Инкапсуляция — это одна из четырёх фундаментальных концепций ООП. Названия оставшихся трёх: наследование, полиморфизм, абстракция.

Инкапсуляция в Java является механизмом обёртывания данных (переменных) и кода, работающего с данными (методами), в одно целое.
В инкапсуляции переменные класса будут скрыты от других классов и доступ к ним может быть получен только с помощью метода
их текущего класса. По-другому это называется скрытием данных.

Для достижения инкапсуляции в Java:

Объявите переменные класса как private.
Предоставьте public к методам установки и получения (сеттеру и геттеру) для изменения и просмотра значений переменных*/

/* Плохое в том, что мы обращаемся к полям этого класса через точку,
напрямую обращаемся к этим полям другого класса
Поля должны быть скрыты от пользователя, потому, что вы с ними проводите действия внутри класса Phone, эти данные должны быть для внутреннего использования
например вы решили изменить поле вашего класса Phone , но при этом ваш пользователь уже не сможет использовать это поле
после ваших изменений
Также пользователь может напрямую обращаться к полям класса, такого не должно быть
 */
/* нужно чтобы он обращался через методы , в эти методы мы могли бы поместить проверку
То есть, прежде чем, мы присвоим этим полям значение , мы в этих методах проверили бы
положительное ли это значение , говоря о возрасте,
не пустое ли это значение , если мы говорим об имени
 */
/* Вот такие методы в которых мы проверяем, которые служат прослойкой между вашими полями и вашим конечным пользователем
такие методы называются сеттеры и геттеры
 */
/* сеттеры и геттеры это такое стандартное соглашение и они используются в любом api
api(application programming interface) - это программный интерфейс приложения, интерфейс прикладного программирования
Проще говоря: это тот  интерфейс, через который  пользователь получает доступ к функционал  программы
Пользователю не нужно знать как всё работает внутри , пользователю вы должны давать какой-то интерфейс,
через который он сможет получать нужный ему функционал, пользователь не должен трогать внутреннюю устройство программы,
именно из-за этого мы не даём доступ пользователю к самим переменным, к самим полям класса , мы даём ему доступ к публичным методам
 */
/* private - это ключевое слово, оно обозначает, что это поле доступно и видно только в пределах своего класса */
/* если вы ставите ключевое слово private перед вашим полем, то теперь это поле доступно в пределах этого класса
у нас в примере , в классе Phone, мы можем использовать  изменять эту переменную
 */
/* Как же теперь будет пользователь получать доступ к этим ПОЛЯМ, НАЗНАЧАТЬ ЭТИ ПОЛЯ, ЗНАЧЕНИЯ?
Получать значения он теперь будет через сеттеры и геттеры
 */
/* для начала сделаем сеттеры и геттеры для имени , а затем для возраста */
/* для этого пишем  public  void setName(String userName)
    {
        name = userName;
    }

 */
/* теперь у нас phone может назначить имя с помощью метода setName , придав ему в параметры строку
методы void он назначает, ничего не возвращает
 */
/* а геттер будет с возвращаемым значением String, с пустыми параметрами
public  String getName()
    {
        return name;
    }
    при вызове этого метода будет возвращаться строка, которая является name  в этом классе Phone
 */
/* сделаем также для age
Доступ к полям мы можем получить через методы сеттеры и геттеры
 */
/* мы можем вернуть имя и возраст геттеры методов */
/* Плюс такого подхода в том, что мы например можем внутри нашего класса Phone
можем изменить имя String  в поле нашего класса который находится, грубо говоря логику нашего класса можем изменять, пользователь не заметит этого
 */
/* В сеттерах мы можем проверять корректность ввода
например нашему пользователю нельзя вводить пустое имя
 */