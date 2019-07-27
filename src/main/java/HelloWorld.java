import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Renju
 * @since 1.0
 */
public class HelloWorld {
    public static void main(String args[]) {
        WebDriver webDriver = null;
        try {
            System.out.println("Starting IE explorer .... ");

//            System.setProperty("webdriver.ie.driver", "target/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
//            System.setProperty("webdriver.ie.driver.extractpath", "target/IEDriverServer_x64_3.14.0/");
//            System.setProperty("webdriver.ie.driver.host", "localhost");
//            webDriver = new InternetExplorerDriver();

            System.setProperty("webdriver.chrome.driver", "target/ChromeDriverServer_win32_75.0.3770.140/chromedriver.exe");
            webDriver = new ChromeDriver();

            webDriver.get("https://www.amazon.de");
            //entering data to the searcher
            Thread.sleep(4000);

            System.out.println("Page title is: " + webDriver.getTitle());
            System.out.println("Page URL is: " + webDriver.getCurrentUrl());

//            WebElement searchString = webDriver.findElement(By.id("twotabsearchtextbox"));
            //WebElement searchString = webDriver.findElement(By.xpath("//form[@name='site-search']//input[@id='twotabsearchtextbox']"));
            WebElement searchString = webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchString.sendKeys("KinderWagen 3in1");

            WebElement searchForm = webDriver.findElement(By.xpath("//form[@name='site-search']"));
            searchForm.submit();

        } catch (Exception e) {
            System.out.println("Exception Occured!! ");
            e.printStackTrace();
        } finally {
//            webDriver.close();
//            webDriver.quit();
        }
    }
}
