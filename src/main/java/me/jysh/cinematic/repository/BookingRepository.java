package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}
