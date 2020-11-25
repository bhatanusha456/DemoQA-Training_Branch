Feature: Verify the home page
  Scenario: Verify the page title broken links and images
    Given a web app
    Then Verify the page title
    And Verify the broken links and images

    Scenario: Perform screenshot comparison
