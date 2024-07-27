package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beginTheSession()
	{
		System.out.println("Begin the session - Before hook test");
	}
	@Before("@Credit")
	public void creditBanking()
	{
		System.out.println("before hook of credit banking");
	}
	@Before("@Debit")
	public void debitBanking()
	{
		System.out.println("before hook of debit banking");
	}
	@After("@Credit")
	public void creditBanking1()
	{
		System.out.println("After hook of credit banking");
	}
	@After("@Debit")
	public void debitBanking1()
	{
		System.out.println("After hook of debit banking");
	}
	@After
	public void closeTheBrowser()
	{
		System.out.println("Close the browser+ After hook test");
	}

}

//Hooks in Cucumber
// Unlike background where the scope is within the particular feature, hooks can be used to run before all scenarios irrespective of the feature.
//Also hooks can be used in such a way as to run before certain categories of scenarios by using the tags.
// Before: It will run before all the scenarios in the project
// Before("@tagName"): It will run before those scenarios coming under those tagNames.
//After: It will run after all the scenarios in the project
//After("@tagName"): It will run after those scenarios coming under those tagNames.
// If we have, a general before hook, tagged before hook, background, general after hook, and a tagged after hook, the order of execution is as follow:
// 1. Before 2. Before tagged 3. Background 4. Scenario 5. After tagged 6. After
