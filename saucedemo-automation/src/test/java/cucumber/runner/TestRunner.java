package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cucumber.stepDef",
        plugin = {"pretty", "html:target/tugas_o6_joane-indra-prasetyawan.html"},
        tags = "@tdd",
        monochrome = true
)
public class TestRunner {
}