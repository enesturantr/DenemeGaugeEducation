
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StepImp extends BaseTest{

    @Step("<second> saniye kadar bekle")
    public void waitForsecond(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }
    @Step("<css> Css verilen elementi bul ve <text> değerini yaz")
    public void sendKeysbyCss(String css,String text){
        driver.findElement(By.cssSelector(css)).sendKeys(text);
    }

    @Step("<css> Css verilen elementi bul ve tıkla")
    public void clickBycss(String css){
        driver.findElement(By.cssSelector(css)).click();
    }

    @Step("<css> Cssli elementi bul ve <text> değerini içerdiğini kontrol et")
    public void checkText(String css,String text){
        System.out.println("Text Değeri" + driver.findElement(By.cssSelector(css)).getText());
        assertTrue(driver.findElement(By.cssSelector(css)).getText().contains(text));
    }

    @Step("<id> li elementi bul ve tıkla")
    public void clickByid(String id){
        driver.findElement(By.id(id)).click();
    }

}
