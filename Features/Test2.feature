Feature: Test2
  @Test2

  Scenario Outline: Search Kopaonik for 3 guests and 2 rooms

    Given Navigate to URL "https://www.booking.com/"
    Then Dismiss sign in information
    Then Enter "Crete" into search field by placeholder "Where are you going?"
    Then Wait
    Then Click on Duration of the stay by class "cd1e09fdfe"
    Then Choose check in date
    Then Choose check out date
    Then Click on Number of guests and rooms
    Then Choose number of guests
    Then Choose number of rooms
    Then Click on Done button
    Then Click on Search button for Stays
    Then Verify that search results are displayed
    Then Browser quit

    Examples:
      |22  |
      |11  |



