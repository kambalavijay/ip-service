package com.elite.kvijay9.envelope;

import com.elite.kvijay9.model.Response;

public class ResponseEnvelope<T extends Response> {
    String diffContent;
    T t;

    public String getDiffContent() {
        return diffContent;
    }

    public void setDiffContent(String diffContent) {
        this.diffContent = diffContent;
    }

    public void setResponse(T response) {
        this.t = response;
    }

    public T getResponse() {
        return t;
    }

    @Override
    public String toString() {
        return "ResponseEnvelope{" +
                "diffContent='" + diffContent + '\'' +
                ", t=" + t +
                '}';
    }
}
