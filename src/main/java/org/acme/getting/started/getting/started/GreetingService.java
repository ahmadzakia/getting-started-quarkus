package org.acme.getting.started.getting.started;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author ahmadzakianshori
 * @version GreetingService.java, v 0.1 05-12-2020 06.33
 */
@ApplicationScoped
public class GreetingService {

    public String greeting(String name){
        return "hello "+name;
    }
}
