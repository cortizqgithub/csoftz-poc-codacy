/*----------------------------------------------------------------------------*/
/* Source File:   HOMECONTROLLER.JAVA                                         */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Jul.27/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.codacy.controller.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * REST API for Codacy Home page.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 16 (JDK)
 */
@RestController
@RequestMapping("/api/v1/codacy/home")
public class HomeController {

    /**
     * Returns unique message (demo purposes).<br/>
     * GET /api/v1/codacy/home
     *
     * @return Unique message.
     */
    @GetMapping()
    public Mono<String> getHome() {
        return Mono.just("Landing Page");
    }
}
