package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\scenerio.feature",glue="org.test",plugin= {"json:target/ven.json"})
public class TestRunner {

}
