package com.elite.kvijay9.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RequestMapping("/ipadrs")
@RestController
public class IPAddressController {
    private final Logger logger = LoggerFactory.getLogger(IPAddressController.class);


    @GetMapping
    public ResponseEntity<String> getIPAddress(){
        logger.info("ipadrs api is invoked");
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch ( UnknownHostException  e) {
            e.printStackTrace();
        }
        logger.info("IpAddress : " + ip.toString());
        logger.info("ipadrs api is invocation is ended");
        return ResponseEntity.ok(ip.toString());
    }
}
/*
* ip-service/10.116.0.8
*
*
*
*
*
* */