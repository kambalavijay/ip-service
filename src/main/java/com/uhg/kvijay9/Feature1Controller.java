package com.uhg.kvijay9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature1")
public class Feature1Controller {

    @GetMapping
    public String getFeature1(){
        return "feature1";
    }
}
