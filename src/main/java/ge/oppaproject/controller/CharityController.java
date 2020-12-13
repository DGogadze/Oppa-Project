package ge.oppaproject.controller;

import ge.oppaproject.model.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CharityController {
    @GetMapping("/charity")
    public String charity(){
        return "charity";
    }

    @PostMapping("/charity")
    public String charity(@RequestParam String privateId,
                          @RequestParam String phoneNumber,
                          @RequestParam String amount){
        Transaction transaction = new Transaction();
        transaction.charityTransaction(privateId, phoneNumber, amount);
        return "redirect:/";
    }
}
