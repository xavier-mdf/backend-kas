package com.altran.kas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/")
public class MainController {

    @GetMapping
    public Mono<String> greeting() {
        return Mono.just("Hello Kas!");
    }
}
