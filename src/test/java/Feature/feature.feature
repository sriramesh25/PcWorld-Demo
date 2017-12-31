Feature: E-Commerce Application
  @smoke
  Scenario: Add Product to Bag
    Given Iam in the PcWorld Home Page
    And I search for "lenovo"laptop
    And I select the Laptop from the List
    When I click Add to Basket the item updated on the Basket

    @regression
    Scenario: Remove Item from the Basket
      Given Iam in the PcWorld
      And I search for "Lenovo" laptop
      And I select item from the list
      And I add item to the shopping Basket
      And Ima in the Basket
      When I click remove to empty the Basket



