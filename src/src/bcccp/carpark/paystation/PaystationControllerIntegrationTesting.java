package src.bcccp.carpark.paystation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package src.bcccp.carpark.paystation;

import bcccp.carpark.Carpark;
import bcccp.carpark.paystation.IPaystationUI;
import bcccp.carpark.paystation.PaystationController;
import bcccp.carpark.paystation.PaystationUI;
import bcccp.tickets.adhoc.AdhocTicketDAO;
import bcccp.tickets.adhoc.AdhocTicketFactory;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.adhoc.IAdhocTicketFactory;
import bcccp.tickets.season.IUsageRecordFactory;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;


/**
 *
 * @author SACHIN CHHETRI
 */
public class PaystationControllerIntegrationTesting {
    public static void main(String[] args){
        IAdhocTicketFactory adhocTicketFactory = new AdhocTicketFactory();
//        IAdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(adhocTicketFactory);
//        IUsageRecordFactory factory = new UsageRecordFactory();
//        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
//        Carpark carpark = new Carpark("name",0,adhocTicketDAO,seasonTicketDAO);
//        IPaystationUI ui = new PaystationUI(20,40);
//        PaystationController psc = new PaystationController(carpark,ui);
//        psc.log("log method test");
//        psc.setState(psc.teststate);
//        psc.ticketInserted("Abc123");
//        System.out.println("Barcode printed");
    }
}
