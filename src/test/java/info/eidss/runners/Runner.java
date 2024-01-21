package info.eidss.runners;

import  org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

plugin = {

    "json:target/cucumber.json",
    "html:target/cucumber-reports.html",
    "rerun:target/rerun.txt",
    "me.jvt.cucumber.report.PrettyReports:target/cucumber"

},
features = {"src/test/resources/features"},
glue = {"info/eidss/steps"},
dryRun= false,
tags = "",
publish = true

)

//C:\Users\msi\Desktop\BV Dev\QA\eidss_v7_testing_framework\src\test\resources\features
//src\test\java\info\eidss\step_definitions


public class Runner {
    

}
