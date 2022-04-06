package com.elite.kvijay9.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// rest api -> restcontrollers
@RestController // marking
@RequestMapping("/v1/api/hello")
public class HelloWordController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name){
        if(name.equals("vijay")){
            return "Hello " + name + ", Musalaiah";
        }
        return "Hello " + name;
    }

}
