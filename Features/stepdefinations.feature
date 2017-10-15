Feature: Login in to gcr shop
@tag1
Scenario: Title of your scenario
  Given I am on the gcrshop
  When ishould click on new registration
  And i fill the details 
  Then I submit my details 
  Then i should be on loginpage
Scenario Outline: Title of your scenario
    Given I am on the gcrshop
    When ishould click on new registration
    And i fill the details "<FirstName>" and "<LastName>"
    Then I submit my details
    Then i should be on loginpage

    Examples: 
      | FirstName | LastName |
      | Ramana    | Reddy    |
      | Muttana   | Venkata  |

      