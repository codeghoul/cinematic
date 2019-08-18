package me.jysh.cinematic.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode()
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "poster")
    private String poster;

    @Column(name = "genre")
    private String genre;

    @Column(name = "duration")
    private Integer duration;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Screening> screenings;
}
