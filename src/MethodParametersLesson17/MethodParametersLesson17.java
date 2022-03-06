package MethodParametersLesson17;

public class MethodParametersLesson17 {
    public static void main(String[] args)
    {
        Car c = new Car();
        c.setNameAndAge("Ferrari", 1000);


        String s = "Ford";

        Car c1 = new Car();
        c1.setNameAndAge(s,2000);

        c.speak();
        c1.speak();
    }
}
class Car
{
    String name;
    int age;

    void setNameAndAge(String username, int userage)       // имя параметра важно только в пределах этого метода setName
    {
        name = username;
        age = userage;
    }


    int calculateYearsToRetirement()
    {
        int years = 65- age;
        return years;
    }


    void speak()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Меня зовут " + name + ", мне " + age +  " лет ");
        }
    }


    void sayHello()
    {
        System.out.println("Привет!");
    }
}

/* В параметры метода мы можем поставлять всё что угодно */
/* У нас в методе параметров может быть сколько угодно
/* setName этим методом мы хотим назначать наше поле name каким-то значением
void setName() этот метод полностью эквивалентен этой строчке == c.name = "Ferrari";
 */
/* мы не можем вызвать параметр setName и чтобы он назначил имя которое мы хотим с пустыми параметрами
Чтобы он назначил имя которое мы хотим , мы должны сначала написать параметры
 напишем что этот метод setName будет принимать строку и назовём его username
  внутри этого метода он считает что эта строка называется username
  void setName(String username)
  {
  name - username;
  }                                       */
/* В любом методе есть параметры
Если у нас,  у метода пустой параметр, это обозначает, что при вызове метода не нужно заполнять параметр ();
 */
/* Часто случается так, что методу,  для того чтобы выполниться, ему необходимо какие-то дополнительные сведения, значения */

