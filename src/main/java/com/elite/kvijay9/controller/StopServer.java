package com.elite.kvijay9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stop")
@RestController
public class StopServer {

    @GetMapping
    public String stopServer(){
        System.exit(-1);
        return "server stopped";
    }
}
