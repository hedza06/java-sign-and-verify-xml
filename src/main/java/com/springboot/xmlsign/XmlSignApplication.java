package com.springboot.xmlsign;

import com.springboot.xmlsign.services.XmlDocumentSigningService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class XmlSignApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlSignApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(XmlDocumentSigningService xmlDocumentSigningService) {
        return args -> xmlDocumentSigningService.signXMLDocument();
    }
}
