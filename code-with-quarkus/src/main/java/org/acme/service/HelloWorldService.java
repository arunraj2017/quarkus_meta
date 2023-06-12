package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldService {

    public String getNameService() {
        return "Hello from Service";
    }
}
