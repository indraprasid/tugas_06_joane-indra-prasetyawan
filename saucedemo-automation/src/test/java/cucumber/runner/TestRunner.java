package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import io.cucumber.plugin.Plugin;

import java.io.File;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Locale;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cucumber.stepDef",
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"}
//      plugin = {"pretty", "json:target/cucumber-report/cucumber.json", "de.monochromata.cucumber.report.PrettyReports:target/cucumber-report"}
//      plugin = {"pretty", "html:target/tugas_o6_joane-indra-prasetyawan.html"}
//      plugin = {"pretty", "json:target/cucumber-report/cucumber.json", "html:target/cucumber-report/cucumber.html"}
//        tags = "",
//        monochrome = true
)
public class TestRunner {
//    public static void generateReport() throws IOException {
    public static void generateReport() {
        File reportOutputDirectory = new File("target/cucumber-report");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-report/cucumber.json");

        String buildNumber = "101";
        String projectName = "saucedemo-automation";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber(buildNumber);

        configuration.addClassifications("Browser", "Chrome");
        configuration.addClassifications("Branch", "release/1.0");
        configuration.addClassifications("Platform", System.getProperty("os.name").toUpperCase());
        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
        configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
        configuration.setQualifier("cucumber", "Chrome 80, mobile");
        // points to the demo trends which is not used for other tests
        configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));

        configuration.addCustomCssFiles(Collections.singletonList("src/test/resources/css/stackoverflow-light.min.css"));
        configuration.addCustomJsFiles(Arrays.asList("src/test/resources/js/enable-highlighting.js", "src/test/resources/js/highlight.min.js"));

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
