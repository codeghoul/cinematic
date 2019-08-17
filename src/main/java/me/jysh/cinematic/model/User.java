package me.jysh.cinematic.model;

import java.util.Set;

public class User {
    private int id;
    private String userName;
    private String password;

    private Set<Booking> bookings;
}
