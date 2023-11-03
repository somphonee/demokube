package co.th.priorsolution.treanning.demokube.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @Value("${app.text}")
    private  String appText;
    @GetMapping("/say/hi")
    public Map<String, String> sayHi(){
        Map<String, String> x = new HashMap<>();
        x.put ("hello", "world");
        x.put ("text", this .appText);
        return x;
    }
}
