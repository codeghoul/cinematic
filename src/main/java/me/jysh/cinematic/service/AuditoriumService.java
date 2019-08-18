package me.jysh.cinematic.service;

import me.jysh.cinematic.model.Auditorium;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuditoriumService {

    List<Auditorium> getAllAuditoriums();
}
