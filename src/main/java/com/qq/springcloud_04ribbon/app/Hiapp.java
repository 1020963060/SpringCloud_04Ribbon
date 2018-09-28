package com.qq.springcloud_04ribbon.app;

import com.qq.springcloud_04ribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hiapp {
    @Autowired
    private HiService hiService;
    @GetMapping("/hiribbon.do")
    public String hi(){
        System.out.println("这是ribbon消费");
        return hiService.hi();
    }
}
