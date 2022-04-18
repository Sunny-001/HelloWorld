package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author mayongming
 * @Date 2022/4/18 14:22
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test/{something}")
    public String test(@PathVariable String something) {
        return Optional.ofNullable(something).orElseThrow(() -> new RuntimeException("something is null"));
    }
}
