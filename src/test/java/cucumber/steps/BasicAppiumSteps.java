/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber.steps;

import cucumber.pages.PageAppium;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author nadies
 */
public class BasicAppiumSteps {

    @Dado("que Appium está encendido")
    public void que_appium_está_encendido() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        PageAppium base = new PageAppium();
        
        
        //boolean check = PageAppium.driver !== null;
        assertEquals("Tengo fiaca", PageAppium.driver, null);
        
        base.init();
        PageAppium.driver.getStatus();
        assertEquals("Tengo fiaca 222", PageAppium.driver, null);

    }

    @Cuando("conecto con Appium")
    public void conecto_con_appium() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Entonces("recibo datos")
    public void recibo_datos() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
