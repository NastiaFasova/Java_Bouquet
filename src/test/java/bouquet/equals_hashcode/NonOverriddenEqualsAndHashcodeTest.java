package bouquet.equals_hashcode;

import bouquet.Florist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonOverriddenEqualsAndHashcodeTest {
    private EqualsAndHashcode practice = new EqualsAndHashcode();
    private Florist firstFlorist;
    private Florist secondFlorist;

    @Before
    public void setUp() throws Exception {
        firstFlorist = new Florist("Oleh", "Ivanov", 4, 32);
        secondFlorist  = new Florist("Oleh", "Ivanov", 4, 32);
    }

    @Test
    public void NonOverriddenHashcode_EqualObjects_False() {
        boolean actual = practice.nonOverriddenHashcode(firstFlorist, secondFlorist);
        Assert.assertFalse(actual);
    }

    @Test
    public void NonOverriddenEquals_EqualObjects_False() {
        boolean actual = practice.nonOverriddenHashcode(firstFlorist, secondFlorist);
        Assert.assertFalse(actual);
    }
}