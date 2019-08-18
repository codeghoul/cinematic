package me.jysh.cinematic.service.impl;

import me.jysh.cinematic.model.Theatre;
import me.jysh.cinematic.repository.TheatreRepository;
import me.jysh.cinematic.service.TheatreService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class TheatreServiceImpl implements TheatreService {
    private TheatreRepository theatreRepository;

    public TheatreServiceImpl(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }


    @Override
    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }
}
