package info.eidss.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

    /*
     * Creating a private constructor, so we are closing
     * access to the object of this class from outside the class
     */

    private Driver() {

    }

    /*
     * Declared a ThreadLocal variable to manage a pool of WebDriver instances.
     * 
     */
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
     * Create a re-usable utility method which will return same driver instance when
     * we call it
     */
    public static WebDriver getDriver() {

        if (driverPool.get() == null) {
            /*
             * We read our browserType from configuration.properties.
             * This way, we can control which browser is opened from outside our code, from
             * configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
             * Depending on the browserType that will be return from
             * configuration.properties file
             * switch statement will determine the case, and open the matching browser
             */

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();

                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    //driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    //driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "incognito-chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("incognito");
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    //driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

        }

        return driverPool.get();

    }

    /*
     * This method will make sure our driver value is always null after using quit()
     * method
     */
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this line will terminate the existing session. value will not even be null
            driverPool.remove();
        }
    }

}
