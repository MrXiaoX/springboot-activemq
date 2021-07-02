package com.cardlan.boot_mq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AcitivimqController {

    @RequestMapping("/getActivimq")
    public String getActivimq(String param){
        return param+":"+ UUID.randomUUID();
    }
}
