package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.service.HelloWorldService;

@Path("/hello")
public class GreetingResource {

    @Inject
     private HelloWorldService service;
    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public String hello() {
        return this.service.getNameService();
    }
}
