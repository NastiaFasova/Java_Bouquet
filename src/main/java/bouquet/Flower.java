package bouquet;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Flower {
    private Colour colour;
    private double size;
    private TypeOfFlower typeOfFlower;

    public Flower(Colour colour, TypeOfFlower typeOfFlower) {
        this.colour = colour;
        this.typeOfFlower = typeOfFlower;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "colour=" + colour +
                ", size=" + size +
                ", typeOfFlower=" + typeOfFlower +
                '}';
    }
}
