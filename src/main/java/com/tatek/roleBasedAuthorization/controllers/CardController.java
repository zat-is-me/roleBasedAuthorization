package com.tatek.roleBasedAuthorization.controllers;

import com.tatek.roleBasedAuthorization.entities.Cards;
import com.tatek.roleBasedAuthorization.repositories.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CardController {

    @Autowired
    private CardsRepository cardsRepository;

    @GetMapping("/myCards")
    public List<Cards> getCardDetails(@RequestParam int id) {
        List<Cards> cards = cardsRepository.findByCustomerId(id);
        if (cards != null ) {
            return cards;
        }else {
            return null;
        }
    }
}
