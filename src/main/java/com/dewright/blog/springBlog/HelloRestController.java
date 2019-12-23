package com.dewright.blog.springBlog;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index() {
        return "Welcome to my Hello World!";
    }
}
