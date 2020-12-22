package bouquet;

import bouquet.exception.NotEnoughFlowersException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FloristIT {
    @Mock
    private Flower myFlower;
    @Mock
    private Bouquet.Wrapper myWrapper;
    @Spy
    private Florist florist;

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
