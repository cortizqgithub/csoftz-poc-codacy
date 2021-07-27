package com.csoftz.codacy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * Spring Boot Context test.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 16 (JDK)
 */
@SpringBootTest
class CsoftzPocCodacyApplicationTests {
    @Autowired
    private ApplicationContext appContext;

    /**
     * Load Spring Boot App to validate it is well configured.
     */
    @Test
    void contextLoads() {
        assertThat(appContext).isNotNull();
    }

}
