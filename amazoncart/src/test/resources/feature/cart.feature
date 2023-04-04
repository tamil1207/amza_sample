Feature: Validate the prodect and add to cart

  @tag1
  Scenario: open the chrome and launch the url
    Given Open the browser launch url
    Then click sign 
    And navigate to the sign page enter the credenctial
    Then navigate to the password page enter the credenctial
    When navigate to home page and  Search the prodect
    Then click the workspce button
    And sort high to low
    Then Click the second option
    
    @tag2
    Scenario: Select the prodect add to cart
    Then Navigate  to the Prodect page
    And click to Add cart button
    Then Verify the prodect
    