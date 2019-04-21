package com.xp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTaskApplicationTests {

    //注入邮件发送器
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //设置邮件标题
        message.setSubject("xp发送的邮件标题-测试标题");
        //设置邮件内容
        message.setText("发送的邮件内容-66666666");
        //邮件接收者的邮箱地址
        message.setTo("xiaopeng1911@outlook.com");
        //邮件发送者邮箱
        message.setFrom("897778411@qq.com");
        //发送邮件
        javaMailSender.send(message);
    }

}
