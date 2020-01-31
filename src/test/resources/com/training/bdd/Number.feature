Feature: Test Number Service

  Scenario: Get characteristics of a number
    Given a number 3
    When I try to get characteristics for a number
    Then I get number characteristics saying prime as true and perfect square as false
