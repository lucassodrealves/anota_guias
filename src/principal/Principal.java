/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Telas.Inicial_gui;

/**
 *
 * @author lucas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Conecta.driver.CarregaDriver();
        
        new Inicial_gui().setVisible(true);
       
        // TODO code application logic here
    }
    
}
