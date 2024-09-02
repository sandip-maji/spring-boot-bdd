package com.citi.cps.utils;

public class CommonUtils {

    public static String[] getCucumberOptions(String featureFilesPath, String tags){
        return new String[]{
                "--glue", "com.citi.cps.bdd.stepdefinitions",
                "--tags",tags,
                featureFilesPath
        };

    }

    public static String[] getCucumberOptionsWithReport(String featureFilesPath, String tags){
        return  new String[]{
                "--plugin", "json:target/cucumber.json",  // JSON report
                "--plugin", "html:target/cucumber.html",  // HTML report
                "--plugin", "pretty",                     // Pretty console output
                "--plugin", "junit:target/cucumber.xml",  // JUnit XML report (optional)
                "--plugin", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", // Allure report (optional)
                "--glue", "com.citi.cps.bdd.stepdefinitions",                 // Your step definitions package
                "--tags", tags,                           // Tags to run specific scenarios
                featureFilesPath                           // Path to your feature files
        };
    };


}
