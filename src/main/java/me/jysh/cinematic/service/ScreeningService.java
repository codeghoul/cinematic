package me.jysh.cinematic.service;

import me.jysh.cinematic.model.Screening;

import java.util.List;

public interface ScreeningService {
    List<Screening> getAllScreenings();

    Screening getScreenById(Long screening_id);
}
