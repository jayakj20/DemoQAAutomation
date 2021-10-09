Feature: Elements page

  Scenario:Text Box
    Given landing on the Demo QA Homepage
    And the elements tab is selected
    When "fullName", "Email", "CurrentAddress", and "PermanentAddress" is submitted
    Then it will be displayed in order in the below textbox