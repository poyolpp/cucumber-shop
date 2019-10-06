Feature: Check Stock

  Background:
    Given a product Macbook for 10 in stock with price 40000 for each product
    And a product Lenovo for 5 in stock with price 25000 for each product

    Scenario: Buy product more than stock
      When I buy 12 Macbook that more than stock
      Then There are 10 Macbook in stock

    Scenario: Buy product less than stock
      When I buy 2 Lenovo that less than stock
      Then There are 3 Lenovo in stock