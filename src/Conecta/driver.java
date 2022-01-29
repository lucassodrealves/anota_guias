/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conecta;

import Telas.Inicial_gui;




/**
 *
 * @author lucas
 */
public class driver {
    
    public static void CarregaDriver(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        System.out.println("Driver carregado!");
    }
        catch(Exception senão){
            System.out.println("Driver nada de carregar");
    }
}
    
}
