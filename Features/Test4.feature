Feature: Test4
@Test4

Scenario Outline: Search Attractions for Prague

  Given Navigate to URL "https://www.booking.com/"
  Then Dismiss sign in information
  Then Click on Attractions
  Then Enter "Prague" into search field by placeholder "Where are you going?"
  Then Wait
  Then Choose destination from displayed options
  Then Click on field to choose dates
  Then Click on start date
  Then Click on end date
  Then Click on Search button for Attractions
  Then Wait
  Then Verify that attractions are displayed
  Then Browser quit

  Examples:
    |44  |
    |11  |