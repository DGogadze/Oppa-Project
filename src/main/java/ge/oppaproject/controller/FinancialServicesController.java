package ge.oppaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinancialServicesController {
    @GetMapping("/financialservices")
    public String financialServices(){
        return "financialservices";
    }
}
