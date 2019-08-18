package me.jysh.cinematic.scheduled_task;

import lombok.extern.slf4j.Slf4j;
import me.jysh.cinematic.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@Slf4j
@Component
public class DeleteSevenDayOldScreening {
    private ScreeningRepository screeningRepository;

    @Autowired
    public DeleteSevenDayOldScreening(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    /*
     * This method uses cron 0 0 0 * * ? (run every day midnight) to delete screenings which are already 7 days old.
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void deleteSevenDayOldScreening() {
        LocalDate today = LocalDate.now();

        screeningRepository.deleteInBatch(screeningRepository.findAll().stream()
                .filter(screening -> DAYS.between(screening.getDate(), today) > 7).collect(Collectors.toList()));

        log.info("Delete seven day old screenings");
    }
}
