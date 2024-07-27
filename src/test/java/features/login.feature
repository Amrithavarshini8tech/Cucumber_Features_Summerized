@tag
Feature: Application login
 
 # if the scenarios below all have some common steps to be done .i.e; common prerequities. We can write it under the backgroundkeyword
 # Background is specific to particular feature file. It needs to be written seapartely for each file.
 # Steps in background will run before the starting of each scenarios
 Background:
 Given setup the entries in databases
 When launch the browser from config variable
 And hit the home page url of banking site
 
 
 #1.Scenario
  @RegressionTest
  Scenario: Admin page defualt login
    Given user is on net banking landing page
    When user login into application using "admin" and "123"
    Then home page is displayed
    And cards are displayed
    
 #Reusable
 #Same lines as #1. are reused in other scenarios(#2., #3.) reducing extra codes to be written
 

  
 #2.if we use (.+) known as 'regular expressionm' and ^ in the begining  $ in the end, in step definition file, it means it accept any variables not just string
 #for string just put {} in the step defin.
 # So even if don't put the variables below in quotes or not it will identify and take the value 
   @SmokeTest
   Scenario: Admin page defualt login
    Given user is on net banking landing page
    When user login into application using "admin1" and 1234
    Then home page is displayed
    And cards are displayed
 # To comment multiple lines: ctrl+/
 
 #3. Scenario Outline , i.e: test will run multiple times with different set of data
   @SmokeTest
   Scenario Outline: Admin page defualt login
    Given user is on net banking landing page
    When user login into application using "<Username>" and "<Password>"
    Then home page is displayed
    And cards are displayed
    Examples:
    |Username|Password|
    |admin   |123     |
    |admin1  |1234    |
 
 # All the above 3 scenarios can be written as a single scenario outline as all are having same content and code
   
#4.Concept of data table. We can pass any number of data in the form of List
   @RegressionTest
   Scenario: Admin page defualt login
    Given user is on net banking landing page
    When user login into application 
    |Amritha|
    |Varshini|
    |amritha@gmail.com|
    |testimonial|
    Then home page is displayed
    And cards are displayed
   

 
 
