package com.uhg.kvijay9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RequestMapping("/ipadrs")
@RestController
public class IPAddressController {

    @GetMapping
    public String getIPAddress(){
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch ( UnknownHostException  e) {
            e.printStackTrace();
        }
        return ip.toString();
    }
}
