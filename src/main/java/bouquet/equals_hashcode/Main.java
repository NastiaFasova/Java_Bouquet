package bouquet.equals_hashcode;

public class Main {
    public static void main(String[] args) {
        EqualsAndHashcode practice = new EqualsAndHashcode();
        System.out.println("Непереопределенный hashcode()\nХэш-коды равны? " + practice.nonOverriddenHashcode());
        System.out.println("*********************************");
        System.out.println("Переопределенный hashcode()\nХэш-коды равны? " + practice.overriddenHashcode());
        System.out.println("*********************************");
        System.out.println("Переопределенный equals()\n Объекты равны? " + practice.overriddenEquals());
        System.out.println("*********************************");
        System.out.println("Непереопределенный equals()\nОбъекты равны? " + practice.nonOverriddenEquals());
    }
}
