package com.salesforce.login;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		//features="C:Users/nikil kaarthi/Downloads/Maven_new/com.cucu/src/test/resources/com/salesforce/login/login.feature",
		// glue={"C:Users/nikil kaarthi/Downloads/Maven_new/com.cucu/src/main/java/com/salesforce/login/Login.java"},
		format={"pretty","html:test-output"},
		monochrome=true,
		dryRun=false
		//tags={"@smoketest"}
		
	)
public class LoginRun {

public void loginRun(){
}
}

