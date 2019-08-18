package me.jysh.cinematic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
public class ShowTiming {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalTime startTime;
    private LocalTime endTime;

    @OneToMany(mappedBy = "showTiming")
    private Set<Show> shows;
}