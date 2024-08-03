package org.example.jobschedulerdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PhoneService {

    public void ringAlarm() {
        log.info("[PhoneService][ringAlarm] ring ring ring...");
    }

}
