package com.citi.cps.boot.controller;

import com.citi.cps.boot.service.BootScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CucumberController {

    @Autowired
    private BootScriptRunner bootScriptRunner;

    @GetMapping("/execute")
    public ResponseEntity<String> executeCucumberTests(
            @RequestParam(value = "featureFilePath", defaultValue = "classpath:FeatureFiles") String featureFilePath,
            @RequestParam(value = "tags", defaultValue = "") String tags,
            @RequestParam(value = "gateway", defaultValue = "defaultGateway") String gateway,
            @RequestParam(value = "environment", defaultValue = "defaultEnv") String environment) {

        try {
            // Pass parameters to the service
            byte response = bootScriptRunner.executeScript(featureFilePath, tags);

            return ResponseEntity.ok("Cucumber tests executed successfully.");

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error executing Cucumber tests: " + e.getMessage());
        }
    }
}
