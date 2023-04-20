package com.test.jdatest.helloword;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    public String helloworld(){
        return "Hello World";
    }

    @RequestMapping(method=RequestMethod.GET, path="/hello-world-bean")
    public HelloWorldBean helloworldbean(){
        return new HelloWorldBean("Hello World");
    }

    @RequestMapping(method=RequestMethod.GET, path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));

    }
}
