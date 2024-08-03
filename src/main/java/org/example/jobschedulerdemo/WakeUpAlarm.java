package org.example.jobschedulerdemo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class WakeUpAlarm {

    private final PhoneService phoneService;

    public WakeUpAlarm(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @Schedules(
            value = {
                    @Scheduled(cron = "0 0 6 * * * "), @Scheduled(cron = "0 5 6 * * * ")
            })
    public void wakeMeUpEveryMorning() {
        phoneService.ringAlarm();
    }

}
