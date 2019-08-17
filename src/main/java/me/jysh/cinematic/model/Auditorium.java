package me.jysh.cinematic.model;

import java.util.Set;

public class Auditorium {
    private Long id;
    private Long theatreId;
    private Integer seatCount;

    private Set<Show> shows;
}
