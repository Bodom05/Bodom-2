/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.tickets.adhoc;

/**
 *
 * @author Ayush
 */
public class AdhocTicketFactoryUnitTest {
    public static void main(String args[]){
    AdhocTicketFactory adTicFac = new AdhocTicketFactory("1234",200);
        
        System.out.println(adTicFac.getBarcode());
        System.out.println(adTicFac.getCarparkId());
    }
}
