package ge.oppaproject.controller;

import ge.oppaproject.model.Transaction;
import ge.oppaproject.service.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
    @Autowired
    TransactionDataService transactionDataService;

    @GetMapping("/utility")
    public String utility(){
        return "utility";
    }
    @PostMapping("/utility")
    public String utility(@RequestParam String privateId,
                          @RequestParam String phoneNumber,
                          @RequestParam String amount){
        Transaction transaction = new Transaction();
        transaction.utilityTransaction(privateId, phoneNumber, amount);
        transactionDataService.addTransaction(transaction);
        return "redirect:/";
    }
}
