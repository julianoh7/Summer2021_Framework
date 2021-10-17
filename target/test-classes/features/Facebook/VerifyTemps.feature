Feature: Verify Temps

  Scenario: Verify temps are equal

    Given I am on darkSky Homepage
    Then I go down to today's TimeLine
    And I click on today's TimeLine
    And I get today's temp
    Then I get the temp inside the element
    Then I confirm that the temps are matching
    Then I quit Webpage

    Scenario: Comparing Time locator Hours
      Given I am on darkSky Homepage
      When I get hours in 2 hour intervals
      And I get current time with 2 hour intervals
      Then I quit Webpage

      Scenario: Verify School Furniture contains Classroom Storage
        Given I am on ClassRoomEssentialsWebsite
        When I move mouse over to School Furniture
        And I find Classroom Storage and Verify
        Then I quit Webpage