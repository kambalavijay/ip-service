package com.elite.kvijay9.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class ResourceResponse {

    private Resource resource;
    @JsonIgnore
    private List<String> logAttrs;
    private int status;

    public ResourceResponse() {

    }

    public ResourceResponse(Resource resource, List<String> logAttrs, int status) {
        this.resource = resource;
        this.logAttrs = logAttrs;
        this.status = status;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public List<String> getLogAttrs() {
        return logAttrs;
    }

    public void setLogAttrs(List<String> logAttrs) {
        this.logAttrs = logAttrs;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
