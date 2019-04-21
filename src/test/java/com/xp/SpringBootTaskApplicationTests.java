package com.xp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTaskApplicationTests {

    //注入邮件发送器
    @Autowired
    JavaMailSenderImpl javaMailSender;

    /**
     * 简单邮件发送 SimpleMailMessage
     *
     * */
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

    /**
     * 复杂邮件发送
     *
     * */
    @Test
    public void test01() throws MessagingException {
        //创建复杂消息
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setSubject("Java测试发送邮件给才B！！！");
        //设为true可以解析html标签
        helper.setText("<font color=red><h2>才B的酒桶很垃圾！！！</h2></font>",true);
//        helper.setTo("947504876@qq.com");
        helper.setTo("947504876@qq.com");
        helper.setFrom("897778411@qq.com");

        //上传附件(图片,word等等)
        helper.addAttachment("beer.jpg", new File("E:\\img\\beer.png"));
        helper.addAttachment("bobby.jpg", new File("E:\\img\\bobby.jpg"));
        helper.addAttachment("a.docx", new File("E:\\img\\a.docx"));

        //发送
        javaMailSender.send(message);
    }
}
