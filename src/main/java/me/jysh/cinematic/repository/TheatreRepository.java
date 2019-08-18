package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
