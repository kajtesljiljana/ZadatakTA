Feature: Test3
  @Test3

  Scenario Outline: Search Flights to Lisbon

    Given Navigate to URL "https://www.booking.com/"
    Then Dismiss sign in information
    Then Click on Flights
    Then Wait
    Then Click on field Flight destination
    Then Enter flight destionation "Lisbon"
    Then Wait
    Then Choose Airport
    Then Click on date field
    Then Choose day of departure
    Then Choose day of return
    Then Click on Search button for Flights
    Then Wait
    Then Verify that flights are displayed
    Then Browser quit

    Examples:
      |33  |
      |11  |