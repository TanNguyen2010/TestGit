package testGitHub;

//public class TestTamVu {
//}
//package webdriver;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

        import java.time.Duration;
        import java.util.concurrent.TimeUnit;


public class TestTamVu {
    WebDriver driver;
//    String projectPath = System.getProperty("user.dir");
//    String osName = System.getProperty("os.name");

    WebDriverWait explicitWait;

    @BeforeClass
    public void beforeClass() {
//        if (osName.contains("Windows")) {
//            System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//        } else {
//            System.setProperty("webdriver.chrome.driver", projectPath + "/browserDrivers/chromedriver");
//        }
//
//
//        System.out.println("Create new web driver");
        driver = new ChromeDriver();
//
//        // implicitWait sẽ ảnh hưởng trực tiếp đến 2 hàm: findElement/findElements
//
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.manage().window().maximize();
//
    }

    @Test
    public void TC_01_Not_Enough() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
//        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");

//        explicitWait = new WebDriverWait(driver,15);
        explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15L));

        // waiting the date time picker is displayed
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.rcMain")));

        // Validate 'Selected Dates:' has value: 'No Selected Dates to display.'
        WebElement text = driver.findElement(By.cssSelector("span.label"));

        Assert.assertEquals(text.getText(),"No Selected Dates to display.");

        // Wait cho ngay 19 dc phep click
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='19']")));

        // Click on date 19
        driver.findElement(By.xpath("//a[text()='19']")).click();

        // Wait cho den khi ajax icon loading is dismissed
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[id*='RadAjaxLoadingPanel1ctl00']>div.raDiv")));


        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='rcSelected']/a[text()='19']")));


        Assert.assertEquals(driver.findElement(By.cssSelector("span.label")).getText(),"Wednesday, July 19, 2023");
//        Assert.assertEquals(driver.findElement(By.cssSelector("span.label")).getText(),"Wednesday, July 19, 2023");

    }
    @AfterClass
    public void afterClass() {
        //driver.quit();
    }
}
