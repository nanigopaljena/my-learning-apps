@Sample2
Feature: Sample 2 Tests

  Scenario: Successful test for sample 2
    Given the initial setup is done
    When I make the call to "test-app" API
    Then I should receive "My app says 'Ahoy, World!'"

  Scenario: Fail test for sample 2
    Given the initial setup is done
    When I make the call to "test-app" API
    Then I should receive "My app says 'I am sinking!'"
