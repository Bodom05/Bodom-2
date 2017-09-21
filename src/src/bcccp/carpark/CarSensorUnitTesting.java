/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark;
import bcccp.carpark.CarSensor;
/**
 *
 * @author SACHIN CHHETRI
 */
public class CarSensorUnitTesting {
        public static void main(String[] args){
       System.out.println("Creating an instance of carsensor class...");
       CarSensor carsensor1= new CarSensor("Sachin", 90,90);
       System.out.println("cs an instance of CarSensor class created...");
       //carsensor1.carDetected=true;
       System.out.println("Testing the getId method of carSensor class");
       System.out.println(carsensor1.getId());
       System.out.println("Tested successfully");
       System.out.println("Testing the carIsDetected method in carSensor class");
       System.out.println(carsensor1.carIsDetected());
    }

    
}
