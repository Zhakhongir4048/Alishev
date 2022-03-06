package AbstractClassesLesson41;

public abstract class Animal {               // Класс - объекты которого не должны быть созданы
   public void eat(){
       System.out.println("I am eating...");
   }

   public abstract void makeSound();         // Метод, который не имеет реализации, только в абстрактных классах мы можем создавать абстрактные методы
}
