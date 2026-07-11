package com.Mockitotesting.exercise01and02;
public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String data() {
        String data = api.getData();
        return "Processed: " + data;
    }
}