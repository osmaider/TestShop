package com.testing.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue={"com.testing.stepDefinitions"}
)
public class ProductToTheShoppingCartRunner {
}
