package com.uhg.kvijay9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature1")
public class Feature1Controller {

    Logger logger = LoggerFactory.getLogger(Feature1Controller.class);

    @GetMapping
    public String getFeature1(){
        logger.info("feature1 invoked...");
        return "feature1";
    }

}
