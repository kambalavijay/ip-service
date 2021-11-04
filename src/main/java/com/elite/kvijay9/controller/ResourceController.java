package com.elite.kvijay9.controller;

import com.elite.kvijay9.envelope.ResponseEnvelope;
import com.elite.kvijay9.model.Resource;
import com.elite.kvijay9.model.ResourceResponse;
import com.elite.kvijay9.service.ResourceService;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    // api -> controller -> service(BL) -> repository(db)

    // get, put, delete, post -> 1/2 day 4 hours
    // api/v/student/ -> 2 points
    // story -> groom -> assign -> he/she create tasks(individual pieces of work) -> 3 points
    // student
    @Autowired
    private ResourceService resourceService;

    private Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @PutMapping("/{id}")
    public ResponseEntity<String> updateResourceById(@PathVariable("id") Long id) {
        resourceService.updateResource(id);
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resource> getResourceById(@PathVariable("id") Long id){
        Resource resource = resourceService.getResourceById(id);
        return ResponseEntity.ok(resource);
    }

    @PostMapping
    public ResponseEntity<Optional> addResource(@RequestBody Resource resource){
        Optional optional = Optional.of(resourceService.addResource(resource));
        return ResponseEntity.ok(optional);
    }

}
