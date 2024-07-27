@tag
Feature: Application login2

 Background:
 Given setup the entries in databases
 When launch the browser from config variable
 And hit the home page url of banking site
 
 #1.Scenario
  @RegressionTest @Credit
  Scenario: credit page defualt login
    Given user is on net banking landing page
    When user login into application using "credit" and "123"
    Then home page is displayed
    And cards are displayed
    
#2. Scenario
   @SmokeTest @Debit
   Scenario: debit page defualt login
    Given user is on net banking landing page
    When user login into application using "debit" and 1234
    Then home page is displayed
    And cards are displayed


   

 
 
