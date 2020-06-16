package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Login.feature",glue="Steps",dryRun=false,monochrome=true,strict=true,
plugin= {"pretty","junit:CucumberXML/Report/Cucumbe.xml"})

public class RunnerClass {

}
