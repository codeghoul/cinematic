package me.jysh.cinematic.model;

import java.time.LocalTime;

public class Booking {
    private Long id;
    private Long showId;
    private Long userId;
    private LocalTime bookingTime;
    private boolean isBooked;
    private boolean isActive;
}
