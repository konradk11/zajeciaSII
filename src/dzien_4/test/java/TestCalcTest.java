import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalcTest extends BaseTest {







    @Test
    public void addTest() {
        Calculator calcTest = new Calculator();
        int expectedValue = 9;
        int actualValue = calcTest.add(5, 4);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void multiplicationTest() {
        Calculator calcMultiTest = new Calculator();
        int expectedValue = 8;
        int actualValue = calcMultiTest.multiplication(2, 4);
        Assert.assertEquals(expectedValue, actualValue);
    }


}
