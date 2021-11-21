/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber.steps;

import cucumber.pages.BasePageAppium;
import cucumber.pages.PageAppium;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author nadies
 */
public class AppiumBaseSteps {

    @Dado("que tengo Appium preparado")
    public void que_tengo_appium_preparado() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        PageAppium base = new PageAppium();
        
        //base.init();
        //boolean check = PageAppium.driver !== null;
        assertEquals("Tengo fiaca", PageAppium.driver, null);
    }

    @Cuando("inicio una app")
    public void inicio_una_app() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Entonces("llego a ella")
    public void llego_a_ella() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
