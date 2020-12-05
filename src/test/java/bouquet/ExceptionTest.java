package bouquet;

import bouquet.exception.NotEnoughFlowersException;
import org.junit.Test;

import java.util.List;

public class ExceptionTest {

    @Test(expected = NotEnoughFlowersException.class)
    public void CreateBouquet_FewFlowers_ThrownException() {
        Florist florist = new Florist("Ihor",
                "Luka", 5, 31);
        florist.createBouquet(List.of(new Flower(Colour.PINK, TypeOfFlower.ROSE),
                new Flower(Colour.RED, TypeOfFlower.VIOLETS )), new Bouquet.Wrapper(Colour.PINK));
    }
}
