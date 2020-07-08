@smoke
Feature: Validate login functionality

  @reg
  Scenario Outline: Check login with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

		@valid
    Examples: 
      | username | password |
      | Admin    | admin123 |
 
		@invalid
    Examples: 
      | username | password |
      | User1    | pass1    |
