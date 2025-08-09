
@tag
Feature: Error validation
  I want to use this template for my feature file


  @ErrorValidation
  Scenario Outline: Title of your scenario outline
    Given I landed on Kace Page
    When Logged in with username <name> and password <password>
    Then "Login Failed: Incorrect user name or password." message is displayed

     Examples: 
      | name  								|  password		    |
      | echo@gmail.com |  12@0      | 
