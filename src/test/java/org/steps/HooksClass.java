package org.steps;

import java.io.IOException;

import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
@Before
public void beforeScenario() {
	launchBrowser("chrome");
	urlLaunch("http://adactinhotelapp.com/");
	maximize();
}
@After
public void afterScenario(Scenario sc) throws IOException {
	if(sc.isFailed()) {
		takeScreenShot(sc.getName());
	}
	quit();
}
}
