import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Random;

public class FormTest extends BaseTest {

    @Test
    public void openTest() throws InterruptedException {

        Random generator = new Random();
        int i = generator.nextInt(6);

        driver.get("http://toolsqa.com/automation-practice-form/");
        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement sex = driver.findElement(By.id("sex-0"));
        WebElement date = driver.findElement(By.id("datepicker"));
        List<WebElement> exp = driver.findElements(By.cssSelector("input[id^='exp']"));
        List<WebElement> profession = driver.findElements(By.cssSelector("input[id^='profession']"));
        WebElement fileInput = driver.findElement(By.name("photo"));

        List<WebElement> tool = driver.findElements(By.cssSelector("input[id^='tool']"));

        WebElement countryList = driver.findElement(By.id("continents"));

        Select continetn = new Select(countryList);

        int numberOfOptions = continetn.getOptions().size();

        i = generator.nextInt(numberOfOptions - 1);

        continetn.selectByIndex(i);
        System.out.println(i);

        new Select(driver.findElement(By.id("selenium_commands"))).selectByVisibleText("Switch Commands");
        WebElement button = driver.findElement(By.id("submit"));


        firstName.sendKeys("Janusz");
        lastName.sendKeys("Wąsik");
        sex.click();
        exp.get(i).click();
        Assert.assertTrue(exp.get(i).isSelected());
        profession.get(0).click();
        profession.get(1).click();
        Assert.assertTrue(profession.get(0).isSelected());
        Assert.assertTrue(profession.get(1).isSelected());
        date.sendKeys("21.09.2018");
        //dodanie pliku
        WebElement uploadFile = driver.findElement(By.id("photo"));
        File photo = new File("src\\files\\dvl.bmp");
        String absolutePaht = photo.getAbsolutePath();
        fileInput.sendKeys(absolutePaht);


        tool.get(1).click();
        button.click();
        Thread.sleep(1500);
        //Assert.assertTrue(firstName.getText().isEmpty());

        Thread.sleep(5000);


    }

}
