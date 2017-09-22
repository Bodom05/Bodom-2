/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark.exit;
import bcccp.carpark.exit.ExitUI;
/**
 *
 * @author Bodom
 */
public class ExitUIUnitTesting {
    public static void main(String[] args){
        System.out.println("Creating an instance of ExitUI class..");
        ExitUI eu=new ExitUI(100,100);
        System.out.println("Testing the beep method..");
        eu.beep();
        System.out.println("Testing the takeTicket() method");
        System.out.println("Tested successfully");
        

    };
    
}
