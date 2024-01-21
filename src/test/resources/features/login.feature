
#Created by Ekrem Mese at 1/12/2024
Feature:  Login Functionality

Background:

  Given the user is on the main page.
  

Scenario:  As a user I should  be able to login with valid credentials

  When the user enters valid credentials
  And user clicks the Login button
  Then the user lands on main page

