package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.SeatBooked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
