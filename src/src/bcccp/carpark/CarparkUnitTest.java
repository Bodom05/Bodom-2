/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark;
import bcccp.carpark.Carpark;

/**
 *
 * @author Ayush
 */
public class CarparkUnitTest {
    public static void main(String[] args){
        Carpark cp = new Carpark();
        cp.carparkId = "123";
        System.out.println(cp.carparkId);
    }
}
