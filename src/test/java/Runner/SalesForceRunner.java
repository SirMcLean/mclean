package Runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/Feature/Sales.feature",glue={"StepDefinition"},monochrome=true,publish=true)


public class SalesForceRunner extends AbstractTestNGCucumberTests {

}
