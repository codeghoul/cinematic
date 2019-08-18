package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
