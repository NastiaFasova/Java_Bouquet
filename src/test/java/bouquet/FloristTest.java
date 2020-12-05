package bouquet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FloristTest {
    Florist florist = new Florist("Ihor",
            "Luka", 5, 31);
    private Bouquet bouquet;
    private Flower firstFlower;
    private Flower secondFlower;
    private Flower thirdFlower;

    @Before
    public void setUp() throws Exception {
        firstFlower = new Flower(Colour.PINK, TypeOfFlower.ROSE );
        secondFlower = new Flower(Colour.RED, TypeOfFlower.LILIES );
        thirdFlower = new Flower(Colour.WHITE, TypeOfFlower.VIOLETS );
        bouquet = new Bouquet(List.of(firstFlower, secondFlower, thirdFlower),
                new Bouquet.Wrapper(Colour.PINK));
    }

    @Test
    public void CreateBouquet_EnoughFlowers_Ok() {
        List<Flower> listOfFlowers = List.of(firstFlower, secondFlower, thirdFlower);
        Bouquet.Wrapper wrapper = new Bouquet.Wrapper(Colour.PINK);
        Bouquet expectedBouquet = new Bouquet(listOfFlowers, wrapper);
        Bouquet actual = florist.createBouquet(listOfFlowers, wrapper);
        Assert.assertEquals(expectedBouquet, actual);
    }

    @Test
    public void FloristWorks_ReturnsMessage_Ok() {
        String expected = "I'm working. My profession is a florist";
        String actual = florist.work();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetTheMostPopularTypeOfFlower_ReturnsFlowers_Ok() {
        Assert.assertEquals(TypeOfFlower.ROSE,
                florist.getTheMostPopularTypeOfFlower(List.of(bouquet)));
    }
}