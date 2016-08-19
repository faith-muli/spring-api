package hello;

import hello.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by faith on 8/19/16.
 */

@RestController
public class GreetingController {
    private static final String template= "Hello %s";
    private static final AtomicLong counter= new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template, name));


    }
}
