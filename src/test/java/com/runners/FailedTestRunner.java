package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "features/.feature",
        glue = "com/step_definitions/PodiumStep.java"

)
public class FailedTestRunner {
}
