package com.example.Security1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    @GetMapping("/demo")
    public String greet()
    {
        return "Hello World";
    }

    @GetMapping("/testcode")
    public String testCode()
    {
        return "Testing the code...";
    }
    @GetMapping("/developcode")
    public String developCode()
    {
        return "Developing the code...";
    }
    @GetMapping("/accessserver")
    public String accessServer()
    {
        return "Accessing the server...";
    }
    @GetMapping("/home")
    public String home()
    {
        return "Welcome to the home page";
    }
}

// Password --> ff8c0e73-9ee6-4e51-beb3-3d072694848c
//              b0ddf2c1-8739-4b36-b932-fa3f2ca5fdc5


