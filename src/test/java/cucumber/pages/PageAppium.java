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
public class PageAppium extends BasePageAppium {
    
    public void init(){
        try {
            super.init();
        } catch(Exception e) {
            System.out.println("PageAppium.init: " + e);
            driver = null;
        }
    }
}
