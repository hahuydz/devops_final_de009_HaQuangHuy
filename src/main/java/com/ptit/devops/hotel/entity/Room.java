package com.ptit.devops.hotel.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "price_per_night")
    private BigDecimal pricePerNight;

    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public Integer getFloor() {
        return floor;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public String getStatus() {
        return status;
    }
}
