package bouquet;

public class Flower {
    private Colour colour;
    private double size;
    private TypeOfFlower typeOfFlower;

    public Flower(Colour colour, TypeOfFlower typeOfFlower) {
        this.colour = colour;
        this.typeOfFlower = typeOfFlower;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public TypeOfFlower getTypeOfFlower() {
        return typeOfFlower;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "colour=" + colour +
                ", size=" + size +
                ", typeOfFlower=" + typeOfFlower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.size, size) != 0) return false;
        if (colour != flower.colour) return false;
        return typeOfFlower == flower.typeOfFlower;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = colour != null ? colour.hashCode() : 0;
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (typeOfFlower != null ? typeOfFlower.hashCode() : 0);
        return result;
    }
}
