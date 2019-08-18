package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
