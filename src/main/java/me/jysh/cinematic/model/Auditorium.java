package me.jysh.cinematic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
public class Auditorium {

    @Id
    @GeneratedValue
    private Long id;
    private Integer seatCount;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    @OneToMany(mappedBy = "auditorium")
    private Set<Seat> seats;
    
    @OneToMany(mappedBy = "auditorium")
    private Set<Show> shows;
}
