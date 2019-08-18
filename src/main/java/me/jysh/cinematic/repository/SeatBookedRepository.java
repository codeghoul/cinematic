package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.SeatBooked;
import org.springframework.data.repository.CrudRepository;

public interface SeatBookedRepository extends CrudRepository<SeatBooked, Long> {
}
