package me.jysh.cinematic.controller;

import me.jysh.cinematic.model.Seat;
import me.jysh.cinematic.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {
    private SeatService seatService;

    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/seats")
    public List<Seat> getAllSeats() {
        return this.seatService.getAllSeats();
    }
}
