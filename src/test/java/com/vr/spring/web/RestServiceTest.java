package com.vr.spring.web;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "classpath:com.vr.spring.web.steps",
        features = "classpath:com/vr/spring/web",
        plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-reports"}
)
public class RestServiceTest {

}