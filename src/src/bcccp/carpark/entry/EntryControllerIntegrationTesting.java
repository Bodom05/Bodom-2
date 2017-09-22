/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import src.bcccp.carpark.IGate;
import bcccp.tickets.adhoc.AdhocTicketDAO;
import bcccp.tickets.adhoc.AdhocTicketFactory;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.adhoc.IAdhocTicketFactory;
import bcccp.tickets.season.IUsageRecordFactory;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;

/**
 *
 * @author Ayush
 */
public class EntryControllerIntegrationTesting {
    public static void main(String[] args) {
    IAdhocTicketFactory adhocTicketFactory = new AdhocTicketFactory();
    IAdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(adhocTicketFactory);
    IUsageRecordFactory factory = new UsageRecordFactory();
    SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
    Carpark carpark = new Carpark("c123", 200, adhocTicketDAO, seasonTicketDAO);
//    IGate igate = new IGate();
//    ICarSensor carsensor = new ICarSensor();
    
    IEntryUI ientryui = new IEntryUI();
    EntryController entry = new EntryController(carpark, igate, null, null, ientryui);
    }
}
