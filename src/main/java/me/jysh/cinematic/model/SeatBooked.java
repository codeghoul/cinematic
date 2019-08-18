package me.jysh.cinematic.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode()
@Table(name = "seat_booked")
public class SeatBooked{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_booked_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    @JsonManagedReference
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    @JsonManagedReference
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    @JsonManagedReference
    private Screening screening;
}
