/*----------------------------------------------------------------------------*/
/* Source File:   CSOFTZPOCCODACYAPPLICATION.JAVA                             */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Jul.27/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.codacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point to the application.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 16 (JDK)
 */
@SpringBootApplication
public class CsoftzPocCodacyApplication {

    /**
     * Main entry point to application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(CsoftzPocCodacyApplication.class, args);
    }

}
