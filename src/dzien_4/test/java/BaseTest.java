import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    int i;
    int j;

    @BeforeClass
    public void anotherMagic(){
        j=5;
    }


    @BeforeMethod
    public void doMagic() {
        i = 5;
    }

    @AfterMethod
    public void print() {
        System.out.println(i);
    }


}
