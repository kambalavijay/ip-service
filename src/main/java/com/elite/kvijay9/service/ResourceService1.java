package com.elite.kvijay9.service;

import com.elite.kvijay9.model.Resource;
import com.elite.kvijay9.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResourceService1 {

    @Autowired
    private ResourceRepository resourceRepository;

    @Transactional
    public void updateResource(Long id){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resourceRepository.updateLastLoginDetails(id);
    }

    public int behave1(){
        return 0;
    }

    public Resource getResourceById(Long id){
        return resourceRepository.getById(id);
    }
}
