package sms.com.rest;

import javax.ws.rs.*;

@Path("/test")
public class HelloWorldRest {

    @GET
    @Path("helloworld")
    public String helloworld(){
        return "Hello World!";
    }

}
