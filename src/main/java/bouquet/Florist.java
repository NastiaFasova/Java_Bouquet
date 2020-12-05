package bouquet;

import bouquet.exception.NotEnoughFlowersException;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

//наследование
public class Florist extends Employee {
    private static final int MIN_NUMBER = 3;
    public Florist(String name, String surname, int experience, int age) {
        super(name, surname, experience, age);
    }

    public Bouquet createBouquet(List<Flower> flowers, Bouquet.Wrapper wrapper) {
        if (flowers.size() < MIN_NUMBER) {
            throw new NotEnoughFlowersException("Not enough flowers for the bouquet!!!");
        }
        Bouquet bouquet = new Bouquet(flowers, wrapper);
        setPrice(bouquet);
        return bouquet;
    }

    private double setPrice(Bouquet bouquet) {
        List<Flower> flowers = bouquet.getFlowers();
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.getTypeOfFlower().getPrice();
        }
        bouquet.setPrice(price);
        return price;
    }

    public TypeOfFlower getTheMostPopularTypeOfFlower(List<Bouquet> bouquets) {
        List<TypeOfFlower> mostPopularTypeOfFlowers = bouquets
                .stream()
                .flatMap(b -> b.getFlowers().stream())
                .map(Flower::getTypeOfFlower)
                .collect(Collectors.toList());

        return mostPopularTypeOfFlowers.stream()
                .reduce(BinaryOperator.maxBy(Comparator.comparingInt(o
                        -> Collections.frequency(mostPopularTypeOfFlowers, o)))).orElse(null);
    }

    //Полиморфизм
    @Override
    public String work() {
        return super.work() + ". My profession is a florist";
    }
}
