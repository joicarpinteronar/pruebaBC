#Author: joicarpinterona@gmail.com
Feature: Validate that the registration of a new user is successful in the uTest portal

  Scenario: Register a user on the uTest portal
    Given That Ivan opens the browser with the url of uTest
    When  I enter the registration data 'Ivan' and 'Pruebas'and 'ivanpruebas@gmail.com'and 'April'and '15'and '1995'
    And I enter credentials 'Colombia2021+' and 'Colombia2021+'
    Then  Validate that the user is created successfully is not 'null'
