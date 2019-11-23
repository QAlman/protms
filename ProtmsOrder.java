import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class ProtmsOrder {

    long  start = System.currentTimeMillis();
    private WebDriver driver;
    private java.lang.String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        start =  System.currentTimeMillis();

        driver = new ChromeDriver(); //1



        baseUrl = "https://protms.ru/";
        //driver.manage().window().setSize(new Dimension(800,600)); //1
        driver.manage().window().maximize(); //2
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @Test
    public void testUntitProtmsAut() throws Exception {


        driver.get(baseUrl);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Главная'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("email")).clear();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("email")).sendKeys("0000000044@mail.ru");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Введите e-mail'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("password")).clear();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("password")).sendKeys("123456Q!");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Введите пароль'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(2);


        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Создать заявку'])[1]/following::button[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.linkText("test2-2 тест 2-2")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//input[@type='text']")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='тест4'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.linkText("Заявки")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Открытые'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='В пути'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Завершенные'])[1]/following::span[1]")).click();
        TimeUnit.SECONDS.sleep(2);



        
        driver.close();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test proceed = " + " " + (System.currentTimeMillis() - start)+ " "+" ms");

        driver.quit();
        java.lang.String verificationErrorString = verificationErrors.toString();
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

    private java.lang.String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            java.lang.String alertText = alert.getText();
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


    public void run() {
    }

    public void start() {
    }


}
