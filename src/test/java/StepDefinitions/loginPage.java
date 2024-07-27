package StepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {
	@Given("user is on net banking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("Landing page");
	   
	}
	@When("^user login into application using (.+) and (.+)$")
	public void user_login_into_application_using_and(String string, String string2) {
	   System.out.println(string +"and"+ string2);
	}
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home Page");
	    
	}
	@And("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Crads are displayed");
	    
	}
	/*
	 * @When("user login into application") public void
	 * user_login_into_application(io.cucumber.datatable.DataTable dataTable) { //
	 * Write code here that turns the phrase above into concrete actions // For
	 * automatic transformation, change DataTable to one of // E, List<E>,
	 * List<List<E>>, List<Map<K,V>>, Map<K,V> or // Map<K, List<V>>. E,K,V must be
	 * a String, Integer, Float, // Double, Byte, Short, Long, BigInteger or
	 * BigDecimal. // // For other transformations you can register a DataTableType.
	 * throw new io.cucumber.java.PendingException(); }
	 */
	@When("user login into application")
	public void user_login_into_application(List<String>details) {
	  System.out.println(details.get(0)+ details.get(1)+ details.get(2)+details.get(3));
	}
	//background implementation
	@Given("setup the entries in databases")
	public void setup_the_entries_in_databases() {
	System.out.println("setup the databases");
	}
	@When("launch the browser from config variable")
	public void launch_the_browser_from_config_variable() {
	    System.out.println("lauch the browser");
	}
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	  System.out.println("hit the home page url");
	}
}
