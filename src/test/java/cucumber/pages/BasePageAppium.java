/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber.pages;

/**
 *
 * @author nadies
 */
import cucumber.pages.PropertyLoader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;

public class BasePageAppium {

    public static AppiumDriverLocalService service;
    public static AndroidDriver<WebElement> driver;

    public void init() throws Exception {
        // Carga del fichero de propiedades
        PropertyLoader loadproperty = new PropertyLoader();
        // Recuperación del fichero de propiedades de la ruta y nombre de la aplicación móvil
//        String appiumON = System.getProperty("appiumON");
        String appiumON = "S";
//        String appiumON = System.getProperty("appiumON");
        String device = System.getProperty("device");
        //System.out.println("AppiumOn: " + appiumON);
        // Generación de las capabilites a nivel del servicio de Appium
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

        // Generación de las capabilites a nivel de driver
        DesiredCapabilities clientCapabilities = new DesiredCapabilities();
        //clientCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //clientCapabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");

        //clientCapabilities.setCapability(MobileCapabilityType.UDID, device);
        //clientCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        try {
            if (appiumON.equals("S")) {
                URL url_appium = new URL("http://" + loadproperty.loadProperties().getProperty("AppiumServerIP") + ":"
                        //+ loadproperty.loadProperties().getProperty("AppiumServerPort"));
                        + loadproperty.loadProperties().getProperty("AppiumServerPort") + "/wd/hub");
                System.out.println(url_appium);
                driver = new AndroidDriver(url_appium, clientCapabilities);
            }/* else {
                File app = new File(loadproperty.loadProperties().getProperty("apkDir"), loadproperty.loadProperties().getProperty("apkName"));
                desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                // Appium service
                AppiumServiceBuilder builder = new AppiumServiceBuilder().withCapabilities(desiredCapabilities)
                        .withIPAddress(loadproperty.loadProperties().getProperty("AppiumServerIP"))
                        .usingPort(Integer.valueOf(loadproperty.loadProperties().getProperty("AppiumServerPort")).intValue());
                service = builder.build();
                service.start();
                driver = new AndroidDriver(service.getUrl(), clientCapabilities);
            }*/
        } catch (Exception e) {
            throw new Exception("Error connecting to Appium service : " + e.getMessage());
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
