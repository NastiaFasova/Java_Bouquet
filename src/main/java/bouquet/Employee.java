package bouquet;

//абстрактный класс
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                '}';
    }

    public String work() {
        return "I'm working ";
    }
}
