/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark.paystation;
import bcccp.carpark.paystation.PaystationUI;

/**
 *
 * @author Sachin Chhetri
 */
public class PaystationUIUnitTesting{
    public static void main(String[] args){
        System.out.println("creating paystationUI1, an instance of PaystationUI class...");
        PaystationUI pay = new PaystationUI(90,90);
        System.out.println("paystationUI1, an instance of PaystationUI class created");
        System.out.println("Testing the deregisterController method of PaystationUI class");
        System.out.println("Testing the log method");
        pay.log("sachin");
        System.out.println("Testing the beep method");
        pay.beep();
       System.out.println("Tested successfully");
    }
}

