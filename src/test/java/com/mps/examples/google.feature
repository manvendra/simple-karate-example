Feature: Feature to test Google website

  Background:
    * print name.first

  Scenario: Google site should be up
    Given url 'https://www.google.com'
    When method Get
    Then status 200

  Scenario: Google site should not respond to PUT
    Given url 'https://www.google.com'
    When method PUT
    Then assert responseStatus != 200