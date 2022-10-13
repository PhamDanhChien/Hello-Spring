package com.chienpham.key_manager.controllers;

import com.chienpham.key_manager.models.Key;
import com.chienpham.key_manager.services.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class KeyController {
    @Autowired
    KeyService keyService;

    @GetMapping("/")
    public List<Key> home() {
        System.out.println("Chien");
        return this.keyService.list();
    }
}
