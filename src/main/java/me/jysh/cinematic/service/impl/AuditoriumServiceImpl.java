package me.jysh.cinematic.service.impl;

import me.jysh.cinematic.model.Auditorium;
import me.jysh.cinematic.repository.AuditoriumRepository;
import me.jysh.cinematic.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class AuditoriumServiceImpl implements AuditoriumService {
    private AuditoriumRepository auditoriumRepository;

    @Autowired
    public AuditoriumServiceImpl(AuditoriumRepository auditoriumRepository) {
        this.auditoriumRepository = auditoriumRepository;
    }

    @Override
    public List<Auditorium> getAllAuditoriums() {
        return auditoriumRepository.findAll();
    }
}
