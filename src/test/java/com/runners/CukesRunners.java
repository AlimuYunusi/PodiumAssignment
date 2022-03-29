package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report2.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",//contact root
        glue = "com/step_definitions",//source root
        dryRun=false,
        tags = "@test1"
)
public class CukesRunners {
}
