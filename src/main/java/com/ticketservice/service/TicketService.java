package com.ticketservice.service;

import com.ticketservice.model.Ticket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class TicketService {

    private static HashMap<Long, Ticket> ticketsStorage;

    public TicketService() {
        this.ticketsStorage = new HashMap<>();
    }


    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(33, String.valueOf(45), (short) 99, LocalDateTime.now(),
                false, 'B', 10.00, new BigDecimal(149.99));
        Ticket ticket2 = new Ticket(15, String.valueOf(11), (short) 12, LocalDateTime.now(),
                false, 'A', 24.100, new BigDecimal(55.99));
        Ticket ticket3 = new Ticket(24, String.valueOf(13), (short) 100, LocalDateTime.now(),
                false, 'C', 0, new BigDecimal(13.99));
        Ticket ticket4 = new Ticket(1, String.valueOf(45), (short) 12, LocalDateTime.now(),
                false, 'A', 24.100, new BigDecimal(149.99));
        Ticket ticket5 = new Ticket(13, String.valueOf(41), (short) 13, LocalDateTime.now(),
                false, 'B', 0, new BigDecimal(149.99));
        Ticket ticket6 = new Ticket(45, String.valueOf(42), (short) 11, LocalDateTime.now(),
                false, 'C', 24.100, new BigDecimal(0.00));
        Ticket ticket7 = new Ticket(99, String.valueOf(26), (short) 15, LocalDateTime.now(),
                false, 'B', 24.100, new BigDecimal(149.99));
        Ticket ticket8 = new Ticket(14, String.valueOf(45), (short) 99, LocalDateTime.now(),
                false, 'A', 24.100, new BigDecimal(11.34));
        Ticket ticket9 = new Ticket(12, String.valueOf(45), (short) 99, LocalDateTime.now(),
                false, 'C', 24.100, new BigDecimal(149.99));
        Ticket ticket10 = new Ticket(199, String.valueOf(45), (short) 99, LocalDateTime.now(),
                false, 'B', 24.100, new BigDecimal(149.99));

        ticketsStorage.put(ticket1.getId(), ticket1);
        ticketsStorage.put(ticket2.getId(), ticket2);
        ticketsStorage.put(ticket3.getId(), ticket3);
        ticketsStorage.put(ticket4.getId(), ticket4);
        ticketsStorage.put(ticket5.getId(), ticket5);
        ticketsStorage.put(ticket6.getId(), ticket6);
        ticketsStorage.put(ticket7.getId(), ticket7);
        ticketsStorage.put(ticket8.getId(), ticket8);
        ticketsStorage.put(ticket9.getId(), ticket9);
        ticketsStorage.put(ticket10.getId(), ticket10);
    }

}
