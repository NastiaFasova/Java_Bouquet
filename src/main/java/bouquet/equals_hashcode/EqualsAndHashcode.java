package bouquet.equals_hashcode;

import bouquet.*;

import java.util.List;

public class EqualsAndHashcode {

    /*returns false*/
    public boolean nonOverriddenHashcode() {
        Florist firstFlorist = new Florist("Oleh", "Ivanov", 4, 32);
        Florist secondFlorist  = new Florist("Oleh", "Ivanov", 4, 32);
        int firstHashcode = firstFlorist.hashCode();
        int secondHashcode = secondFlorist.hashCode();
        System.out.println(firstFlorist);
        System.out.println(secondFlorist);
        return firstHashcode == secondHashcode;
    }

    /*return  true*/
    public boolean overriddenHashcode() {
        Flower firstFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        Flower secondFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        int firstHashcode = firstFlower.hashCode();
        int secondHashcode = secondFlower.hashCode();
        System.out.println(firstFlower);
        System.out.println(secondFlower);
        return firstHashcode == secondHashcode;
    }

    /*returns true*/
    public boolean overriddenEquals() {
        Flower firstFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        Flower secondFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        System.out.println(firstFlower);
        System.out.println(secondFlower);
        return firstFlower.equals(secondFlower);
    }

    /*returns false*/
    public boolean nonOverriddenEquals() {
        Florist firstFlorist = new Florist("Oleh", "Ivanov", 4, 32);
        Florist secondFlorist  = new Florist("Oleh", "Ivanov", 4, 32);
        System.out.println(firstFlorist);
        System.out.println(secondFlorist);
        return firstFlorist.equals(secondFlorist);
    }
}
