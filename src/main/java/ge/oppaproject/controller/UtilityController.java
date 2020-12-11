package ge.oppaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {
    @GetMapping("/utility")
    public String utility(){
        return "utility";
    }
}
