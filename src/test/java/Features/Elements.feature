Feature: Elements page
  Scenario: Verify the Elements page
    Given Verify the page title and text
    Then Verify the menu list
    And Verify for broken links

    Scenario: Verify the textbox page
      Given a text box page
      Then Verify each text boxes
      And Enter the form

      Scenario: Checkbox page
        Given a checkbox page
        Then Verify if checkbox is enabled
        Then Verify the check box name
        Then verify and list all the selection
        And Check the expand and collapse
