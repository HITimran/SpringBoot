package com.boot.spring.projectInBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${pageController.msg}")
    private String controllerMsg;

    @Value("${app.description}")
    private String appDescription;


    @RequestMapping("/")
    public String printOnPage()
    {
        return controllerMsg+"\n"+appDescription;
    }
}
