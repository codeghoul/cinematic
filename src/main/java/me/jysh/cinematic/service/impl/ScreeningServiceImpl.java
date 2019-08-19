package me.jysh.cinematic.service.impl;

import me.jysh.cinematic.exception.ScreeningNotFoundException;
import me.jysh.cinematic.model.Screening;
import me.jysh.cinematic.model.Seat;
import me.jysh.cinematic.repository.ScreeningRepository;
import me.jysh.cinematic.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<Screening> getAllScreenings(LocalDate startDate, LocalDate endDate) {
        return screeningRepository.findAll().stream().filter(screening -> screening.getDate().isAfter(startDate) && screening.getDate().isBefore(endDate)).collect(Collectors.toList());
    }

    @Override
    public Screening getScreeningById(Long screening_id) {
        return screeningRepository.findById(screening_id).orElseThrow(ScreeningNotFoundException :: new);
    }

    @Override
    public Screening pushScreening(Screening newScreening) {
        return null;
    }

    @Override
    public Screening updateScreening(Screening updatedScreening, Long screening_id) {
        return null;
    }

    @Override
    public List<Seat> getSeatsByScreeningId(Long screening_id) {
        Screening screening = getScreeningById(screening_id);
        if (screening.getIsFull()) {
            return new ArrayList<>();
        }
        return new ArrayList<>(screening.getAuditorium().getSeats());
    }
}
