package ge.oppaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharityController {
    @GetMapping("/charity")
    public String charity(){
        return "charity";
    }
}
