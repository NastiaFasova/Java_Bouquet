package bouquet.equals_hashcode;

import bouquet.Colour;
import bouquet.Florist;
import bouquet.Flower;
import bouquet.TypeOfFlower;

public class Main {
    public static void main(String[] args) {
        EqualsAndHashcode practice = new EqualsAndHashcode();
        Florist firstFlorist = new Florist("Oleh", "Ivanov", 4, 32);
        Florist secondFlorist  = new Florist("Oleh", "Ivanov", 4, 32);
        System.out.println("Непереопределенный hashcode()\nХэш-коды равны? "
                + practice.nonOverriddenHashcode(firstFlorist, secondFlorist));
        System.out.println("*********************************");

        Flower firstFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        Flower secondFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        System.out.println("Переопределенный hashcode()\nХэш-коды равны? "
                + practice.overriddenHashcode(firstFlower, secondFlower));
        System.out.println("*********************************");

        System.out.println("Переопределенный equals()\n Объекты равны? "
                + practice.overriddenEquals(firstFlower, secondFlower));

        System.out.println("*********************************");
        System.out.println("Непереопределенный equals()\nОбъекты равны? "
                + practice.nonOverriddenEquals(firstFlorist, secondFlorist));
    }
}
