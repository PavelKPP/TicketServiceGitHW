package com.ticketservice.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Ticket {

//    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private long id;
    private String concertHall;
    private short eventCode;
    private LocalDateTime creationDateTime;
    private boolean isPromo;
    private char stadiumSector;
    private double maxBackpackWeight;
    private BigDecimal price;


    public Ticket() {
    }

    public Ticket(int id, short eventCode, boolean isPromo) {
        if (id / 1000 > 9) {
            throw new IllegalArgumentException("id should be less than 4 digits");
        }
        if (eventCode / 100 > 9) {
            throw new IllegalArgumentException("event code should be less than 4 digits");
        }

        this.id = id;
        this.eventCode = eventCode;
        this.isPromo = isPromo;
    }

    public Ticket(int id, String concertHall, short eventCode, LocalDateTime creationDateTime,
                  boolean isPromo, char stadiumSector, double maxBackpackWeight, BigDecimal price) {
        if (id / 1000 > 9) {
            throw new IllegalArgumentException("id should be less than 4 digits");
        }
        if (concertHall.length() > 10) {
            throw new IllegalArgumentException("max chars of concertHall should be les than 10");
        }
        if (eventCode / 100 > 9) {
            throw new IllegalArgumentException("event code should be less than 4 digits");
        }
        if (stadiumSector > 'C' || stadiumSector < 'A') {
            throw new IllegalArgumentException("sector should be in between of A to C");
        }

        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.creationDateTime = creationDateTime;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxBackpackWeight = maxBackpackWeight;
        this.price = price.setScale(2, RoundingMode.DOWN);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id / 1000 > 9) {
            throw new IllegalArgumentException("id should be less than 4 digits");
        }
        this.id = id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        if (concertHall.length() > 10) {
            throw new IllegalArgumentException("max chars of concertHall should be les than 10");
        }
        this.concertHall = concertHall;
    }

    public short getEventCode() {
        return eventCode;
    }

    public void setEventCode(short eventCode) {
        if (eventCode / 100 > 9) {
            throw new IllegalArgumentException("event code should be less than 4 digits");
        }
        this.eventCode = eventCode;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        if (stadiumSector < 'A' || stadiumSector > 'C' ) {
            throw new IllegalArgumentException("sector should be in between of A to C");
        }
        this.stadiumSector = stadiumSector;
    }

    public double getMaxBackpackWeight() {
        return maxBackpackWeight;
    }

    public void setMaxBackpackWeight(double maxBackpackWeight) {
        this.maxBackpackWeight = maxBackpackWeight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.DOWN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && eventCode == ticket.eventCode && isPromo == ticket.isPromo && stadiumSector == ticket.stadiumSector && Double.compare(maxBackpackWeight, ticket.maxBackpackWeight) == 0 && Objects.equals(concertHall, ticket.concertHall) && Objects.equals(creationDateTime, ticket.creationDateTime) && Objects.equals(price, ticket.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, concertHall, eventCode, creationDateTime, isPromo, stadiumSector, maxBackpackWeight, price);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", concertHall='" + concertHall + '\'' +
                ", eventCode=" + eventCode +
                ", creationDateTime=" + creationDateTime +
                ", isPromo=" + isPromo +
                ", stadiumSector=" + stadiumSector +
                ", maxBackpackWeight=" + maxBackpackWeight +
                ", price=" + price +
                '}';
    }


}
