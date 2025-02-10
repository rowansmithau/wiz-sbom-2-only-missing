package com.bmw.atc;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        GreetingResource resource = new GreetingResource();
        String response = resource.hello();
        assertThat(response).isEqualTo("Hello, world!");
    }
}
