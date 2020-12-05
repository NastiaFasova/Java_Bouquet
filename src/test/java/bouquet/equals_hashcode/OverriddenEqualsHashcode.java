package bouquet.equals_hashcode;

import bouquet.Colour;
import bouquet.Flower;
import bouquet.TypeOfFlower;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OverriddenEqualsHashcode {
    private EqualsAndHashcode practice = new EqualsAndHashcode();
    private Flower firstFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
    private Flower secondFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);

    @Before
    public void setUp() throws Exception {
        firstFlower = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
        secondFlower  = new Flower(Colour.YELLOW, TypeOfFlower.ROSE);
    }

    @Test
    public void OverriddenHashcode_EqualObjects_True() {
        boolean actual = practice.overriddenHashcode(firstFlower, secondFlower);
        Assert.assertTrue(actual);
    }

    @Test
    public void overriddenEquals_EqualObjects_True() {
        boolean actual = practice.overriddenEquals(firstFlower, secondFlower);
        Assert.assertTrue(actual);
    }


}
