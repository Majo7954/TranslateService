package com.example.translate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {

    @Autowired
    private TranslateService translateService;

    @GetMapping("/api/translate")
    public String translate(@RequestParam String text) {
        return translateService.translate(text);
    }
}
