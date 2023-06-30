@TestCase02
Feature: Launch Chrome Browser

  Scenario: Login to web
    Given I am on the website
    When I input "lamtatan2010@gmail.com" to username
    And I input "123123123" to password
    And I click login button
    Then I should see "lamtatan2010@gmail.com" if login success