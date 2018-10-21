import org.testng.Assert;
import org.testng.annotations.Test;

public class GreenTests extends BaseTest {


    @Test
    public void shouldBeGreen() {
        //i=5;
        //j=5;
        Assert.assertEquals(j, 5);
        i++;//i=6
        j++;//i=6
    }

    @Test
    public void shouldBeRed() {
        //i=5;
        //j=6;
        Assert.assertEquals(i, j);
    }
}
