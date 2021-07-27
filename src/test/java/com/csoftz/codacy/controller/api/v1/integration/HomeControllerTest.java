/*----------------------------------------------------------------------------*/
/* Source File:   HOMECONTROLLERTEST.JAVA                                     */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Jul.27/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.codacy.controller.api.v1.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.csoftz.codacy.controller.api.v1.HomeController;

/**
 * REST API for Codacy Home page. Unit Tests.<br/>
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 16 (JDK)
 */
@WebFluxTest(HomeController.class)
class HomeControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    /**
     * As HomeController is a WebFlux (it has Mono and Flux return types) it means that this test must use
     * Spring WebFlux testing capabilities.
     */
    @Test
    void shouldReturnUniqueMessage() {
        this.webTestClient
            .get()
            .uri("/api/v1/codacy/home")
            .exchange()
            .expectStatus()
            .isOk()
            .expectBody();
    }
}