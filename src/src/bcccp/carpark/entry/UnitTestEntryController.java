/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark.entry;

/**
 *
 * @author Ayush
 */
public class UnitTestEntryController {
    public static void main(String[] args){
        EntryController entry = new EntryController();
        entry.carEventDetected("123", true);
        System.out.println(entry.getBarcode());
        System.out.println(entry.getCarparkId());
    }
}
