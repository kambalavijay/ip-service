package com.elite.kvijay9.controller;

import com.elite.kvijay9.model.Resource;
import com.elite.kvijay9.model.ResourceResponse;
import com.elite.kvijay9.service.ResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @PutMapping("/{id}")
    public ResponseEntity<String> updateResource(@PathVariable("id") Long id) throws Exception {
        resourceService.updateResource(id);
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceResponse> getRespourceById(@PathVariable("id") Long id){
        ResourceResponse resourceResponse = resourceService.getResourceById(id);
        for (int i = 0; i < resourceResponse.getLogAttrs().size(); i++) {
            logger.info(resourceResponse.getLogAttrs().get(i));
        }
        return ResponseEntity.ok(resourceResponse);
    }

    @PostMapping
    public ResponseEntity<Optional> addResource(@RequestBody Resource resource){
        Optional optional = Optional.of(resourceService.addResource(resource));
        return ResponseEntity.ok(optional);
    }

}
