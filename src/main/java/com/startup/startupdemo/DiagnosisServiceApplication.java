
package com.startup.startupdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosisServiceApplication {

    @GetMapping("/getDiagnosis")
    public String getDoctorService() {
        return " SriNidhi Niku kottha pelli match vachindi! :)..";
    }
}