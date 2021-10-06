Feature: Verify current Date is selected

  Scenario: Verify time-machine button date equals current date
  Given I am on darkSky Homepage
  Then I scroll down
  And I find time-machine
  And I click
    And I find the calender and collect current date
    And I get today's date
    Then I confirm that calendar date is up to date and correct
    Then I quit Webpage