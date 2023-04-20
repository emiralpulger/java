package com.emiralpulger.loans.controller;

import com.emiralpulger.loans.config.LoansServiceConfig;
import com.emiralpulger.loans.model.Customer;
import com.emiralpulger.loans.model.Loans;
import com.emiralpulger.loans.model.Properties;
import com.emiralpulger.loans.repository.LoansRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @Autowired
    LoansServiceConfig loansConfig;

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestBody Customer customer){

        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());

        if (loans!= null){
            return loans;
        } else {
            return null;
        }
    }

    @GetMapping("/loans/properties")
    public String getPropertyDetails() throws JsonProcessingException{
        ObjectWriter ow = new ObjectMapper().writerWithDefaultPrettyPrinter();
        Properties properties = new Properties(
                loansConfig.getMsg(),
                loansConfig.getBuildVersion(),
                loansConfig.getMailDetails(),
                loansConfig.getActiveBranches());
        String jsonStr = ow.writeValueAsString(properties);
        return jsonStr;
    }

}
