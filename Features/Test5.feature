Feature: Test5
  @Test5

  Scenario Outline: Search Flights to Maldives

    Given Navigate to URL "https://www.booking.com/"
    Then Dismiss sign in information
    Then Click on Flights
    Then Wait
    Then Click on field Flight destination
    Then Type flight destionation "Maldives"
    Then Wait
    Then Choose Airport
    Then Click on One Way
    Then Click on date field
    Then Choose day of departure
    Then Click on Search button for Flights
    Then Wait
    Then Verify that flights are displayed
    Then Browser quit

    Examples:
      | 55 |
      | 11 |

