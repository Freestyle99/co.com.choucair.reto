# Autor: Brayan Camilo Bulla

@stories
Feature: UTest
  As a user, I want to create a user for myself on the UTest page
  @Scenario1
  Scenario: Create a user in UTest
    Given than andrea wants to create a user in UTest and enters the registration form
    When she completes the registration form in its entirety
    | strFName | strLName |        strEmail      | strMonth | strDay | strYear |   strPassword  | strConfPassword |
    |   John   |   Smith  | example142@gmail.com |  August  |   24   |  1999   | 321741963987Ut |  321741963987Ut |
    Then she creates her user on the UTest page
    | strTextFinal |
    | Welcome to the world's largest community of freelance software testers |
