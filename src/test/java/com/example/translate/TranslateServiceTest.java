package com.example.translate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TranslateServiceTest {

    @Autowired
    private TranslateService translateService;

    @Test
    public void testTranslate() {
        String text1 = "hello";
        String expectedTranslation1 = "hola";

        String text2 = "world";
        String expectedTranslation2 = "mundo";

        String text3 = "unknown";
        String expectedTranslation3 = "Translation not available";

        assertEquals(expectedTranslation1, translateService.translate(text1));
        assertEquals(expectedTranslation2, translateService.translate(text2));
        assertEquals(expectedTranslation3, translateService.translate(text3));
    }
}
