package io.github.chubbyhippo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvcTester mockMvcTester;

    @Test
    void testGetHello() {
        mockMvcTester.get()
                .uri("/hello")
                .assertThat()
                .hasStatusOk();
    }

}
