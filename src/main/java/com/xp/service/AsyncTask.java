package com.xp.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author xp
 * @CreateTime 2019/04/21  23:19
 * @Function SpringBoot与异步任务
 */

@Service
public class AsyncTask {

    //该注解告诉spring这是一个异步任务,sring会单独开一个线程池进行调用
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
            System.out.println("异步任务处理数据中..........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
