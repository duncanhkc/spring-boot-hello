package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


  @RequestMapping("/hello")
  public String helloworld() {
    System.out.println(System.currentTimeMillis() + " Hello from Xfers");
    return "Hello from Xfers.";
  }


}
