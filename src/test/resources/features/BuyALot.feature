Feature: Buy a lot of products

  Background:
    Given We have these product
      | iron   | 800   |
      | fridge | 3000  |
      | stove  | 5000  |


    Scenario: Buy 3 products
      When I buy fridge with quantity 2
      And I buy iron with quantity 1
      Then total should be 6800