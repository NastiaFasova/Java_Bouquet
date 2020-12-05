package bouquet;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//абстрактный класс
@Getter
@Setter
@ToString
public abstract class Employee {
    private String name;
    private String surname;
    private int experience;
    private int age;

    public Employee(String name, String surname, int experience, int age) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.age = age;
    }

    public String work() {
        return "I'm working";
    }
}
