package com.xp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author xp
 * @CreateTime 2019/04/21  23:31
 * @Function ${VAR}
 */
@Service
public class ScheduleService {

    @Scheduled(cron = "*/2 * * * * *")
    public void hello(){
        System.out.println("hello..............");
    }
}
