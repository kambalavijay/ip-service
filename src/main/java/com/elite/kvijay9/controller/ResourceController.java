package com.elite.kvijay9.controller;

import com.elite.kvijay9.envelope.ResponseEnvelope;
import com.elite.kvijay9.model.Resource;
import com.elite.kvijay9.model.ResourceResponse;
import com.elite.kvijay9.service.ResourceService;
import lombok.AllArgsConstructor;
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
    private ResourceService resourceService;

    private Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @PutMapping("/{id}")
    public ResponseEntity<String> updateResourceById(@PathVariable("id") Long id) {
        resourceService.updateResource(id);
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceResponse> getResourceById(@PathVariable("id") Long id){
        ResponseEnvelope<ResourceResponse> responseEnvelope = resourceService.getResourceById(id);
        ResourceResponse resourceResponse = responseEnvelope.getResponse();
        return ResponseEntity.ok(resourceResponse);
    }

    @PostMapping
    public ResponseEntity<Optional> addResource(@RequestBody Resource resource){
        Optional optional = Optional.of(resourceService.addResource(resource));
        return ResponseEntity.ok(optional);
    }

}
