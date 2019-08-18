package me.jysh.cinematic.service;

import me.jysh.cinematic.model.Screening;
import me.jysh.cinematic.model.Seat;

import java.util.List;

public interface ScreeningService {
    List<Screening> getAllScreenings();

    Screening getScreeningById(Long screening_id);

    List<Seat> getSeatsByScreeningId(Long screening_id);
}
