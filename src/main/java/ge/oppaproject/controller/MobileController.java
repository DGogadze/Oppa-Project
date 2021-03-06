package ge.oppaproject.controller;

import ge.oppaproject.model.Transaction;
import ge.oppaproject.service.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MobileController {
    @Autowired
    TransactionDataService transactionDataService;

    @GetMapping("/mobile")
    public String mobile(){
        return "mobile";
    }

    @PostMapping("/mobile")
    public String mobile(Model model,
                         @RequestParam String phoneNumber,
                         @RequestParam String amount){
        Transaction transaction = new Transaction();
        transaction.mobileTransaction(phoneNumber, amount);
        transactionDataService.addTransaction(transaction);
        return "redirect:/";
    }
}
