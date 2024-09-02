package com.citi.cps.bdd.service;

import com.citi.cps.utils.CommonUtils;
import io.cucumber.core.cli.Main;

public class BDDScriptRunner {

 public void executeScript(String featureFilesPath, String tags){
     Main.run(CommonUtils.getCucumberOptions(featureFilesPath,tags), Thread.currentThread().getContextClassLoader());
 }

}
