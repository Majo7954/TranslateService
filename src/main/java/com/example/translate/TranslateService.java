package com.example.translate;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService {

    private final Map<String, String> translations;

    public TranslateService() {
        translations = new HashMap<>();
        translations.put("hello", "hola");
        translations.put("world", "mundo");
        translations.put("how are you", "cómo estás");
    }

    public String translate(String text) {
        return translations.getOrDefault(text.toLowerCase(), "Translation not available");
    }
}
