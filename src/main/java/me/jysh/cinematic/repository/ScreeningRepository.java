package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
