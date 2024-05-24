package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = "app.greeting.prefix=Hello")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class GreetingControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testGreeting() {
        ResponseEntity<String> r = testRestTemplate.getForEntity("/greet?name=John", String.class);
        assertEquals("checked", HttpStatus.OK.toString(), r.getStatusCode().toString());
//                .get()
//                .uri("/greet?name=John")
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(String.class).isEqualTo("Hello, John!");
    }
}
