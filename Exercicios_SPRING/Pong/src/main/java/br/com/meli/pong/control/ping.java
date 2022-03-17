package br.com.meli.pong.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ping {

    @GetMapping("/Ping")
    @ResponseBody
    public String ping(){
        return "Pong";
    }

}
