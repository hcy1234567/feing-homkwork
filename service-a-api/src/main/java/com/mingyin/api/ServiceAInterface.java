package com.mingyin.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface ServiceAInterface {

    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    String sayHello(@PathVariable("id") Long id,
                   @RequestParam("name") String name,
                   @RequestParam("age") Integer age);



    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getById(@PathVariable("id") Long id);

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getByage(@PathVariable("id") Integer age);

}
