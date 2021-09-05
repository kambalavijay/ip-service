package com.elite.kvijay9.service;

import com.elite.kvijay9.model.Resource;
import com.elite.kvijay9.model.ResourceResponse;
import com.elite.kvijay9.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Transactional
    public void updateResource(Long id) throws Exception {
        resourceRepository.updateLastLoginDetails(id);
    }

    public ResourceResponse getResourceById(Long id){
        Resource resource = resourceRepository.getById(id);
        ResourceResponse resourceResponse = new ResourceResponse();
        resourceResponse.setResource(resource);
        return resourceResponse;
    }

    public Resource addResource(Resource resource){
        resource.setLastupdated(new Timestamp(System.currentTimeMillis()));
        return resourceRepository.save(resource);
    }
}
