package bouquet;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode
public class Bouquet implements Presentable {//имплементация интерфейса
    private List<Flower> flowers;
    private Wrapper wrapper;
    private double price;

    public Bouquet(List<Flower> flowers, Wrapper wrapper) {
        this.flowers = flowers;
        this.wrapper = wrapper;
        setPrice(getSumOfBouquetStreamMethod());
    }

    public Bouquet() {
    }

    public double getSumOfBouquetStreamMethod() {
        double price = getFlowers()
                .stream()
                .map(f -> f.getTypeOfFlower().getPrice())
                .reduce(0D, Double::sum);
        setPrice(price);
        return price;
    }

    public Flower getTheMostExpensiveFlower() {
        return getFlowers()
                .stream()
                .max(Comparator.comparing(f -> f.getTypeOfFlower().getPrice()))
                .orElseThrow(RuntimeException::new);
    }

    public Flower getTheCheapestFlower() {
        return getFlowers()
                .stream()
                .min(Comparator.comparing(f -> f.getTypeOfFlower().getPrice()))
                .orElseThrow(RuntimeException::new);
    }

    public Double getTheAveragePriceOfBouquets() {
        return getFlowers()
                .stream()
                .mapToDouble(f -> f.getTypeOfFlower().getPrice())
                .average()
                .orElseThrow(RuntimeException::new);
    }

    public Map<String, List<Flower>> getAppropriateFlowers(Colour color) {
        Map<String, List<Flower>> map = new HashMap<>();
        List<Flower> appropriateFlowers = getFlowers()
                .stream()
                .filter(f -> f.getColour().equals(color))
                .collect(Collectors.toList());
        map.put("Подходит", appropriateFlowers);
        List<Flower> notAppropriateFlowers = getFlowers()
                .stream()
                .filter(e -> !appropriateFlowers.contains(e))
                .collect(Collectors.toList());
        map.put("Не подходит", notAppropriateFlowers);
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        return map;
    }

    @Override
    public void present() {
        System.out.println("You may present " + this);
    }

    //Внутренний класс
    public static class Wrapper {
        private Colour colour;
        private double length;
        private double width;

        public Wrapper(Colour colour) {
            this.colour = colour;
        }

        @Override
        public String toString() {
            return "Wrapper{" +
                    "colour=" + colour +
                    ", length=" + length +
                    ", width=" + width +
                    '}';
        }
    }

    //Итератор
    public void showFlowers() {
        List<Flower> exhibits = getFlowers();
        Iterator<Flower> iterator = exhibits.iterator();
        while (iterator.hasNext()) {
            Flower flower = iterator.next();
            System.out.println(flower + flower.getTypeOfFlower().showTypeOfFlower());
        }
    }
}
