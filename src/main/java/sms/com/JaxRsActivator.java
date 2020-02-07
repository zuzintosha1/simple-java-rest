package sms.com;

import sms.com.rest.HelloWorldRest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class JaxRsActivator extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public JaxRsActivator() {
        singletons.add(new HelloWorldRest());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
