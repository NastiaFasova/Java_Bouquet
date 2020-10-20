package bouquet;

import bouquet.exception.NotEnoughFlowersException;

import java.util.Iterator;
import java.util.List;

public class Bouquet implements Presentable {//имплементация интерфейса
    private static final int MIN_NUMBER = 3;
    private List<Flower> flowers;
    private Wrapper wrapper;
    private double price;

    public Bouquet(List<Flower> flowers, Wrapper wrapper, double price) {
        if (flowers.size() < MIN_NUMBER) {
            try { //использование кастомного исключения
                throw new NotEnoughFlowersException("Not enough flowers for the bouquet!!!");
            } catch (NotEnoughFlowersException e) {
                e.printStackTrace();
            }
        }
        this.flowers = flowers;
        this.wrapper = wrapper;
        this.price = price;
    }

    public Bouquet(List<Flower> flowers, Wrapper wrapper) {
        this.flowers = flowers;
        this.wrapper = wrapper;
    }

    public Bouquet() {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    //Переопределенные методы
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bouquet bouquet = (Bouquet) o;

        if (Double.compare(bouquet.price, price) != 0) {
            return false;
        }
        if (flowers != null ? !flowers.equals(bouquet.flowers) : bouquet.flowers != null) {
            return false;
        }
        return wrapper != null ? wrapper.equals(bouquet.wrapper) : bouquet.wrapper == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = flowers != null ? flowers.hashCode() : 0;
        result = 31 * result + (wrapper != null ? wrapper.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", wrapper=" + wrapper +
                ", price=" + price +
                '}';
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
