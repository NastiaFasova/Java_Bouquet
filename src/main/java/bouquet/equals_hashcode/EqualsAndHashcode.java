package bouquet.equals_hashcode;

import bouquet.*;

public class EqualsAndHashcode {

    /*returns false*/
    public boolean nonOverriddenHashcode(Florist firstFlorist, Florist secondFlorist) {
        int firstHashcode = firstFlorist.hashCode();
        int secondHashcode = secondFlorist.hashCode();
        System.out.println(firstFlorist);
        System.out.println(secondFlorist);
        return firstHashcode == secondHashcode;
    }

    /*return  true*/
    public boolean overriddenHashcode(Flower firstFlower, Flower secondFlower) {
        int firstHashcode = firstFlower.hashCode();
        int secondHashcode = secondFlower.hashCode();
        System.out.println(firstFlower);
        System.out.println(secondFlower);
        return firstHashcode == secondHashcode;
    }

    /*returns true*/
    public boolean overriddenEquals(Flower firstFlower, Flower secondFlower) {
        System.out.println(firstFlower);
        System.out.println(secondFlower);
        return firstFlower.equals(secondFlower);
    }

    /*returns false*/
    public boolean nonOverriddenEquals(Florist firstFlorist, Florist secondFlorist) {
        System.out.println(firstFlorist);
        System.out.println(secondFlorist);
        return firstFlorist.equals(secondFlorist);
    }
}
