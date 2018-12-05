package org.smartinrubio.springbootawsserverless.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class UppercaseController {

    @PostMapping("/uppercase")
    public String uppercase(@RequestBody String word) {
        return word.toUpperCase();
    }

}
