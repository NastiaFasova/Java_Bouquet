package bouquet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BouquetTest {
    private static final double DELTA = 1e-15;
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
    public void GetSumOfBouquet_ReturnsSum_Ok() {
        Assert.assertEquals(144,
                bouquet.getSumOfBouquetStreamMethod(), DELTA);
    }

    @Test
    public void GetTheMostExpensiveFlower_ReturnsFlower_Ok() {
        Assert.assertEquals(firstFlower, bouquet.getTheMostExpensiveFlower());
    }

    @Test
    public void GetTheCheapestFlower_ReturnsFlower_Ok() {
        Assert.assertEquals(thirdFlower, bouquet.getTheCheapestFlower());
    }

    @Test
    public void GetTheAveragePriceOfBouquets_ReturnsAverageSum_Ok() {
        Assert.assertEquals(48D, bouquet.getTheAveragePriceOfBouquets(), DELTA);
    }

    @Test
    public void GetAppropriateFlowers_ReturnsListOfFlowers_Ok() {
        Map<String, List<Flower>> map = new HashMap<>();
        map.put("Подходит", List.of(firstFlower));
        map.put("Не подходит", List.of(secondFlower, thirdFlower));
        Assert.assertEquals(map, bouquet.getAppropriateFlowers(Colour.PINK));
    }
}