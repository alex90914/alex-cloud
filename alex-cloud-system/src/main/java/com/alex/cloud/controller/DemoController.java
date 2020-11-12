package com.alex.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class DemoController {
    @RequestMapping("/demo")
    public String demo() {
        return "demo";
    }

}
