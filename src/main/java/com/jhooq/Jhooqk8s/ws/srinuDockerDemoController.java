package com.srinu.srinuk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class srinuDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - srinu-k8s i Have updated the message";
    }
}
