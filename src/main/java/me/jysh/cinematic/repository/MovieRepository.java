package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
