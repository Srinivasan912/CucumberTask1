package org.run;

//import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import org.utility.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
				glue = "org.steps", 
				dryRun = false, 
				tags = "@invalid or @valid", 
				monochrome=true,
				plugin = {"html:src\\test\\resources\\Reports\\htmlreport",
						"json:src\\test\\resources\\Reports\\jsonreport\\report.json",
						"junit:src\\test\\resources\\Reports\\Junitreport\\report.xml",
						"rerun:src\\\\test\\\\resources\\\\failedScenario\\\\failed.txt"
				})
public class Runner {
//	@AfterClass
//	public static  void report() {
////		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\jsonreport\\report.json");
//		System.out.println("JVM Report Generated....");
//	}

}
