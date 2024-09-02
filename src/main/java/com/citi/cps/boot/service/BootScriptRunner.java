package com.citi.cps.boot.service;

import com.citi.cps.utils.CommonUtils;
import io.cucumber.core.cli.Main;
import org.springframework.stereotype.Service;

@Service
public class BootScriptRunner {

 public byte executeScript(String featureFilesPath, String tags){

     String[] getCucumberOptions = CommonUtils.getCucumberOptionsWithReport(featureFilesPath,tags);

     return Main.run(getCucumberOptions, Thread.currentThread().getContextClassLoader());
 }

}
