package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="featurefiles/Admin.feature",glue ="Stepdefination",dryRun = false,
monochrome = true, tags=("@tag2"),   plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/admin.html"})
public class AdminLogin {

}
