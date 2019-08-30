@tag
Feature: Add Customers Details
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Generate an Customer Id
    Given user should launch browser and load url
    When User Provide Vaild Details "<fname>","<lname>","<email>","<address>","<phoneno>"
    Then Display customer id

    Examples: 
      | fname  | lname | email           | address | phoneno  |
      | venkat | kumar | sam@gmail.com   | cbe     | 96123456 |
      | bhuvi  | raj   | raj@gmail.com   | pondy   | 98123456 |
      | kalai  | guru  | fasam@gmail.com | chennai | 73123456 |
