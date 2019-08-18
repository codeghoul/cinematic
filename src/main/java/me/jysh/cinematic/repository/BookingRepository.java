package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
