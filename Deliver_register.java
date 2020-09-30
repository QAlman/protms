import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Deliver_reg {

    long  start = System.currentTimeMillis();
    private WebDriver driver;
    private java.lang.String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        start =  System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver", "C:/chrome/chromedriver.exe");
        driver = new ChromeDriver(); //1



        baseUrl = "https://deliver.ru/";
        //driver.manage().window().setSize(new Dimension(800,600)); //1
        driver.manage().window().maximize(); //2
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {


        int  i ;
        int p = 1999;
        for (i =1; i < 10000; i++) {


            driver.get(baseUrl);
            TimeUnit.SECONDS.sleep(1);

            driver.findElement(By.id("mainBtn")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id='app']/div/div[1]/main/div/div[2]/form/div/input")).clear();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id='app']/div/div[1]/main/div/div[2]/form/div/input")).sendKeys("9254442018");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id='app']/div/div[1]/main/div/div[2]/form/span/button")).click();
            TimeUnit.SECONDS.sleep(2);

            //  driver.findElement(By.name("code")).click();
            // TimeUnit.SECONDS.sleep(2);
            // driver.findElement(By.name("code")).clear();
            // TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.name("code")).sendKeys("1111");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//*[@id='app']/div/div[1]/main/div/div[2]/form/span/button")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//button[@type='button']")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("# = "+""+ i);

            //  driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
            //  TimeUnit.SECONDS.sleep(2);


        }

        driver.close();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}


