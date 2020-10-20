package bouquet;

import java.util.List;

//наследование
public class Florist extends Employee {
    public Florist(String name, String surname, int experience, int age) {
        super(name, surname, experience, age);
    }

    public Bouquet createBouquet(List<Flower> flowers, Bouquet.Wrapper wrapper) {
        Bouquet bouquet = new Bouquet(flowers, wrapper);
        setPrice(bouquet);
        return bouquet;
    }

    private static double setPrice(Bouquet bouquet) {
        List<Flower> flowers = bouquet.getFlowers();
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.getTypeOfFlower().getPrice();
        }
        bouquet.setPrice(price);
        return price;
    }

    //Полиморфизм
    @Override
    public String work() {
        return super.work() + ". My profession is a florist";
    }
}
