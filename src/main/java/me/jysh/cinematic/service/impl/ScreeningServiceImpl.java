package me.jysh.cinematic.service.impl;

import me.jysh.cinematic.exception.ScreeningNotFoundException;
import me.jysh.cinematic.model.Screening;
import me.jysh.cinematic.repository.ScreeningRepository;
import me.jysh.cinematic.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ScreeningServiceImpl implements ScreeningService {
    private ScreeningRepository screeningRepository;

    @Autowired
    public ScreeningServiceImpl(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @Override
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    @Override
    public Screening getScreenById(Long screening_id) {
        return screeningRepository.findById(screening_id).orElseThrow(() -> new ScreeningNotFoundException());
    }
}
