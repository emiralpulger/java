package com.emiralpulger.accounts.controller;

import com.emiralpulger.accounts.config.AccountsServiceConfig;
import com.emiralpulger.accounts.model.Accounts;
import com.emiralpulger.accounts.model.Customer;
import com.emiralpulger.accounts.model.Properties;
import com.emiralpulger.accounts.repository.AccountsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @Autowired
    private AccountsServiceConfig accountsConfig;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());

        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }

    @GetMapping("/account/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(
                accountsConfig.getMsg(),
                accountsConfig.getBuildVersion(),
                accountsConfig.getMailDetails(),
                accountsConfig.getActiveBranches());

        String jsonStr = ow.writeValueAsString(properties);
        return jsonStr;
    }
}
