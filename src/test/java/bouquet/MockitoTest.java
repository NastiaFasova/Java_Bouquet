package bouquet;

import bouquet.exception.NotEnoughFlowersException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockitoTest {
    private Flower myFlower = mock(Flower.class);
    private Bouquet.Wrapper myWrapper = mock(Bouquet.Wrapper.class);
    private Florist florist = new Florist("David", "Hlushko", 5, 45);

    @Test
    public void CreateBouquet_ReturnsBouquet_Ok() {
        List<Flower> flowers = List.of(myFlower, myFlower, myFlower);
        when(myFlower.getTypeOfFlower()).thenReturn(TypeOfFlower.ROSE);
        Bouquet bouquet = florist.createBouquet(flowers, myWrapper);
        Assert.assertEquals(flowers, bouquet.getFlowers());
        verify(myFlower, times(6)).getTypeOfFlower();
    }

    @Test(expected = NotEnoughFlowersException.class)
    public void CreateBouquet_ReturnsBouquet_ThrowsNotEnoughFlowersException() {
        List<Flower> flowers = List.of(myFlower);
        when(myFlower.getTypeOfFlower()).thenReturn(TypeOfFlower.ROSE);
        Bouquet bouquet = florist.createBouquet(flowers, myWrapper);
        Assert.assertEquals(flowers, bouquet.getFlowers());
        verify(myFlower).getTypeOfFlower().getPrice();
    }
}
