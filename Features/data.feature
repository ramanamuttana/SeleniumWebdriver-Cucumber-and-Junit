@tag
Feature: Login in to gcr shop

  Scenario: Title of your scenario
    Given I am on the gcrshop
    When ishould click on new registration
    And i fill the ls and submit and am on loginpage

  Scenario Outline: Title of your scenario
    Given I am on the gcrshop
    When ishould click on new registration
    And i fill the details "<FirstName>" and "<LastName>" and  "<Email>" submit and am on loginpage

    Examples: 
      | FirstName | LastName | Email                 |
      |sam   | sekhar    | ssssssssssssa@gmail.com    |
      | sundar   | siva  | ahddezf@gmail.com |
