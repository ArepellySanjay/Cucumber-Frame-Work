package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/UserReg.feature",glue="Stepdefination",dryRun=true
,monochrome=true,plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/UserReg.html"})
public class UserRegistration {

}
