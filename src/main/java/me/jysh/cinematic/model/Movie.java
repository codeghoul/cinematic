package me.jysh.cinematic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String poster;
    private String genre;
    private Integer durationInMinutes;

    @OneToMany(mappedBy = "movie")
    private Set<Show> shows;
}
