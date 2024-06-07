package com.ticketservice.service;

import com.ticketservice.model.Ticket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TicketService {
    public static void main(String[] args) {
        Ticket emptyTicketUsingConstructor = new Ticket();
        System.out.println("[empty ticket using constructor]: " + emptyTicketUsingConstructor);

        Ticket limitedTicketUsingConstrictor = new Ticket(1, (short) 343, true);
        System.out.println("[limited ticket using constructor]: " + limitedTicketUsingConstrictor);

        Ticket fullTicketUsingConstructor = new Ticket(33, String.valueOf(45), (short) 99, LocalDateTime.now(),
                false, 'B', 24.100, new BigDecimal(149.99));
        System.out.println("[full ticket using constrictor]: " + fullTicketUsingConstructor);

        Ticket limitedTicketUsingSetters = new Ticket();
        limitedTicketUsingSetters.setId(111);
        limitedTicketUsingSetters.setPrice(new BigDecimal(44.99));
        limitedTicketUsingSetters.setCreationDateTime(LocalDateTime.now());
        System.out.println("[limited ticket using setter's]: " + limitedTicketUsingSetters);

        Ticket fullTicketUsingSetters = new Ticket();
        fullTicketUsingSetters.setId(123);
        fullTicketUsingSetters.setConcertHall("main");
        fullTicketUsingSetters.setEventCode((short) 123);
        fullTicketUsingSetters.setCreationDateTime(LocalDateTime.now());
        fullTicketUsingSetters.setPromo(true);
        fullTicketUsingSetters.setStadiumSector('A');
        fullTicketUsingSetters.setMaxBackpackWeight(9.99);
        fullTicketUsingSetters.setPrice(new BigDecimal(5.99));
    }
}
