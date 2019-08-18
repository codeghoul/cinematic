package me.jysh.cinematic.service.impl;

import me.jysh.cinematic.model.Seat;
import me.jysh.cinematic.repository.SeatRepository;
import me.jysh.cinematic.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class SeatServiceImpl implements SeatService {
    private SeatRepository seatRepository;

    @Autowired
    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat getSeatById(Long seat_id) {
        return null;
    }

    @Override
    public Seat pushSeat(Seat newSeat) {
        return null;
    }

    @Override
    public Seat updateSeat(Seat updatedSeat, Long seat_id) {
        return null;
    }

    @Override
    public void deleteSeatById(Long seat_id) {

    }
}
