package ge.oppaproject.controller;

import ge.oppaproject.model.Transaction;
import ge.oppaproject.service.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CharityController {
    @Autowired
    TransactionDataService transactionDataService;

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
        transactionDataService.addTransaction(transaction);
        return "redirect:/";
    }
}
