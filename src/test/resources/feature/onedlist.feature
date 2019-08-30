@tag
Feature:generate customer ID
@tag1
Scenario: To generate the customer id
    Given user should launch browser and load url
    When User Provide Vaild Details list
      | venkatesh | kumar | sam@gmail.com | cbe | 96123456 |
    Then Display customer id