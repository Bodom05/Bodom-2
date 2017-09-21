/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.tickets.season;
import bcccp.tickets.season.SeasonTicket;
/**
 *
 * @author SACHIN CHHETRI
 */
public class SeasonTicketUnitTesting {
    public static void main(String[] args){
        System.out.println("Creating an instance of SeasonTicket class");
        SeasonTicket st = new SeasonTicket("Sachin","Chhetri",9,0);
        System.out.println("Testing the getID method");
        st.getId();
        System.out.println(st.getId());
        System.out.println("Tested successfully");
        System.out.println("Testing the getCarparkId method of SesonTicket");
        st.getCarparkId();
        System.out.println(st.getCarparkId());
        System.out.println("Tested successfully");
    }
}
