package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = "app.greeting.prefix=Hi")
public class DirtyContextTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGreetingWithDifferentPrefix() {
        webTestClient.get()
                .uri("/greet?name=John")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hi, John!");
    }
}
