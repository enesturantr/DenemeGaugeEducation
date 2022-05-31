import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseTest {
  protected static WebDriver driver;
  DesiredCapabilities capabilities;
  ChromeOptions chromeOptions;


  @BeforeScenario
  public void setup(){
  System.setProperty("webdriver.chrome.driver","web_driver/chromedriver.exe");
  ChromeOptions chromeOptions = new ChromeOptions();
  chromeOptions.addArguments("--disable-notifications");
  chromeOptions.addArguments("--disable-gpu");
  chromeOptions.addArguments("--disable-popup-blocking");

  driver = new ChromeDriver(chromeOptions);
  driver.manage().window().maximize();
  driver.get("https://www.vatanbilgisayar.com/");
  }

  @AfterScenario
  public void tearDow(){
    driver.quit();
    driver.close();
  }

}
