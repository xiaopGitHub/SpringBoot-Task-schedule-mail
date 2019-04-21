package com.xp.controller;

import com.xp.service.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xp
 * @CreateTime 2019/04/21  23:21
 * @Function 异步任务
 */

@RestController
public class HelloController {

    @Autowired
    AsyncTask asyncTask;

    @GetMapping("/hello")
    public String hello(){
        asyncTask.hello();
        return "success";
    }
}
