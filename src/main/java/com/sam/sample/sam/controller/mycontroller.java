package com.sam.sample.sam.controller;

import lombok.val;
import org.springframework.web.bind.annotation.*;

@RestController
public class mycontroller {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say()
    {
        val a = "10";
        return a;
    }
    @RequestMapping(value = "/yes",method = RequestMethod.GET)
    public String touch()
    {
        return " yes";
    }

    @GetMapping("/model")
    public String getName(@RequestParam("name") String name,@RequestParam("id")String id)
    {
        return name+id;
    }
}
