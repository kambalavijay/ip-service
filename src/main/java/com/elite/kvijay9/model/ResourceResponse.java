package com.elite.kvijay9.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class ResourceResponse extends Response {

    private Resource resource;
    @JsonIgnore
    private List<String> logAttrs;

    public ResourceResponse() {

    }

    public ResourceResponse(Resource resource, List<String> logAttrs) {
        this.resource = resource;
        this.logAttrs = logAttrs;
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

    @Override
    public String toString() {
        return "ResourceResponse{" +
                "resource=" + resource +
                ", logAttrs=" + logAttrs +
                ", code=" + code +
                ", status=" + status +
                '}';
    }
}
