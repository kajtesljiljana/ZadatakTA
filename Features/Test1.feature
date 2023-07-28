Feature: Test1
  @Test1

  Scenario Outline: Search Kopaonik

    Given Navigate to URL "https://www.booking.com/"
    Then Dismiss sign in information
    Then Enter "Kopaonik" into search field by placeholder "Where are you going?"
    Then Click on Duration of the stay by class "cd1e09fdfe"
    Then Choose check in date
    Then Choose check out date
    Then Click on Search button for Stays
    Then Verify that search results are displayed
    Then Browser quit

    Examples:
    |11|
    |11|




