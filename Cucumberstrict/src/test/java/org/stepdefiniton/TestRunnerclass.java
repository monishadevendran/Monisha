package org.stepdefiniton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefiniton", monochrome = true, strict = true)
public class TestRunnerclass {

}
