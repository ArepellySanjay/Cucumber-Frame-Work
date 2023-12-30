package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="featurefiles/EmployeeReg.feature",glue="Stepdefination",dryRun=false,
monochrome=true,plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/EmployeeReg.html"})



public class EmployeeReg {

}
