package me.jysh.cinematic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalTime bookingTime;
    private boolean isBooked;
    private boolean isActive;

    @OneToMany(mappedBy = "booking")
    private Set<SeatBooked> bookedSeats;
}
