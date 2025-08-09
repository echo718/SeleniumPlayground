
@tag
Feature: Login Kace Website
  I want to use this template for my feature file

	Background:
	Given I landed on Kace Page

  @Regression
  Scenario Outline: Positive Test of Landing Kace website
  
    Given Logged in with username <name> and password <word>
    Then "Home" message is displayed on HomePage

    Examples: 
      | name  								|  word		   |
      | echosu                              |  524626.Commm   |

