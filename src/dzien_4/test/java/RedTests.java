import org.testng.Assert;
import org.testng.annotations.Test;

public class RedTests extends BaseTest {
    @Test
    public void shouldBeRed() {
        Assert.assertEquals(i, 5);
    }
}
