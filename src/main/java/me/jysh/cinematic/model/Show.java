package me.jysh.cinematic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "auditorium_id")
    private Auditorium auditorium;

    @ManyToOne
    @JoinColumn(name = "show_timing_id")
    private ShowTiming showTiming;

    @OneToMany(mappedBy = "show")
    private Set<SeatBooked> bookedSeats;

    private LocalDate date;
}
