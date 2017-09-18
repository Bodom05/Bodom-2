/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.tickets.season;
import bcccp.tickets.season.UsageRecord;


/**
 *
 * @author Ayush
 */
public class UsageRecordUnitTest {
    public static void main(String[] args){
    UsageRecord usgRecord = new UsageRecord("1234", 500);
        
        System.out.println(usgRecord.getSeasonTicketId());
        System.out.println(usgRecord.getStartTime());

    }
}
