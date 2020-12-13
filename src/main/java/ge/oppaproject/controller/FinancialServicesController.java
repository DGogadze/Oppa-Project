package ge.oppaproject.controller;

import ge.oppaproject.model.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FinancialServicesController {
    @GetMapping("/financialservices")
    public String financialServices(){
        return "financialservices";
    }

    @PostMapping("/financialservices")
    public String financialServices(@RequestParam String privateId,
                                    @RequestParam String bankAccount,
                                    @RequestParam String amount,
                                    @RequestParam String phoneNumber){
        Transaction transaction = new Transaction();
        transaction.financialServiceTransaction(privateId, bankAccount, amount, phoneNumber);
        return "redirect:/";
    }
}
