
package com.startup.startupdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosisServiceApplication {

    @GetMapping("/getDiagnosis")
    public String getDoctorService() {
        return " Niku kottha pelli match vachindi! :)..";
    }
}