package br.com.meli.hello.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello, "+ name +"!";
    }



}
