package Serialization3TransientSerialVersionUIDLesson47;


import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -6006076401423566635L;
    private int id;
    private String name;




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return id + " : " + name;
    }
}
