package com.elite.kvijay9.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public String getIPAddress(){
        logger.info("ipadrs api is invoked");
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch ( UnknownHostException  e) {
            e.printStackTrace();
        }
        logger.info("IpAddress : " + ip.toString());
        logger.info("ipadrs api is invocation is ended");
        return ip.toString();
        /*
        mvn com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/ip-service:v1

        gcloud container clusters get-credentials kvijay9-cluster-1  --zone us-central1-c

        docker run -ti --rm -p 8080:8080 gcr.io/robust-form-315110/ip-service@sha256:e6ae35c0ff5db8068e5544ddcf3d9f18c88d0a8e1ac8ab2844ff36546b2421d1

        kubectl run ip-service --image=gcr.io/robust-form-315110/ip-service@sha256:e6ae35c0ff5db8068e5544ddcf3d9f18c88d0a8e1ac8ab2844ff36546b2421d1 --port=8080

        */
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