/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark;
import bcccp.carpark.Carpark;
/**
 *
 * @author SACHIN CHHETRI
 */
public class CarparkUnitTesting {
        public static void main(String[] args){
        System.out.println("Creating an instance of Carpark class");
        Carpark carpark1= new Carpark("Sachin",900,null,null);
        System.out.println("An instance of Carpark class is created");
        System.out.println("Testing the getName() method of Carpark class");
        System.out.println(carpark1.getName());
        System.out.println("Tested successfully");
        
    }

}
