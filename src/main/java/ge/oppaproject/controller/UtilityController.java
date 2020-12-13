package ge.oppaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
    @GetMapping("/utility")
    public String utility(){
        return "utility";
    }
    @PostMapping("/utility")
    public String utility(@RequestParam String privateId,
                          @RequestParam String phoneNumber,
                          @RequestParam String amount){
        return "redirect:/";
    }
}
