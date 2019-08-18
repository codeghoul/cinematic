package me.jysh.cinematic.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
@Table(name = "auditorium")
public class Auditorium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auditorium_id")
    private Long id;

    @Column(name = "seat_count")
    private Integer seatCount;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    @JsonManagedReference
    private Theatre theatre;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    private Set<Seat> seats;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    private Set<Screening> screenings;
}
