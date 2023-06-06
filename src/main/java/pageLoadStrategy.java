import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pageLoadStrategy {

    public static void main(String[] args) throws InterruptedException {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        try {
//            // Navigate to Url
//            driver.get("https://google.com");
//            driver.manage().window().maximize();
//            Thread.sleep(500);
//        } finally {
//            driver.quit();
      //  }
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<HOST:PORT>");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
