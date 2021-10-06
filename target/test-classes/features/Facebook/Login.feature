Feature: Login
  #Verify login button is enabled after launching web-page


  Scenario: Verify login button is enabled by default
    Given  I am on Homepage
    Then I verify login button is enabled
    Then I quit Webpage


    Scenario: Verify error message for incorrect username or password
      Given I am on Homepage
      When I enter 'abcd@gmail.com' in username
      And I enter 'abcd@1234' in password
      And I click login button
      Then I verify I see "Sorry, something went wrong." message
      And I quit Webpage