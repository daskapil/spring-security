package com.kapil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @GetMapping("/contacts")
    public String getAccountDetails() {
        return "Here are the contacts from DB";
    }
}
