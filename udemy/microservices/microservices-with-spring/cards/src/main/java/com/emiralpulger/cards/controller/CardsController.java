package com.emiralpulger.cards.controller;

import com.emiralpulger.cards.config.CardsServiceConfig;
import com.emiralpulger.cards.model.Cards;
import com.emiralpulger.cards.model.Customer;
import com.emiralpulger.cards.model.Properties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.emiralpulger.cards.repository.CardsRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @Autowired
    CardsServiceConfig cardsConfig;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {

        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());

        if (cards != null) {
            return cards;
        } else {
            return null;
        }
    }
    @GetMapping("/cards/properties")
    public String getPropertyDetails() throws JsonProcessingException{
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(
                cardsConfig.getMsg(),
                cardsConfig.getBuildVersion(),
                cardsConfig.getMailDetails(),
                cardsConfig.getActiveBranches()
        );
        String jsonStr = ow.writeValueAsString(properties);
        return jsonStr;

    }
}
