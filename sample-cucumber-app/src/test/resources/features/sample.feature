@Sample
Feature: Message API

  Scenario: Successful test
    Given the initial setup is done
    When I make the call to "test-app" API
    Then I should receive "My app says 'Ahoy, World!'"

  Scenario: Fail test
    Given the initial setup is done
    When I make the call to "test-app" API
    Then I should receive "My app says 'I am sinking!'"
