/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.tickets.season;
import bcccp.tickets.season.SeasonTicket;

/**
 *
 * @author Ayush
 */
public class SeasonTicketUnitTest {
    public static void main(String[] args){
    SeasonTicket seasonTic = new SeasonTicket("1234","654", 900, 500);
        
        System.out.println(seasonTic.getId());
        System.out.println(seasonTic.getCarparkId());
        System.out.println(seasonTic.getStartValidPeriod());
        System.out.println(seasonTic.getEndValidPeriod());

    }
}
