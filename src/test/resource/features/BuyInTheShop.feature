Feature: Automated the your logo page

  Scenario: choose a product and it is displayed in the shopping cart successfully
    Given that I opened the browser at automationpractice page
    When  I look for 'dress' and select any displayed result to go to the shopping cart
    Then  should the shopping cart show the product is not 'null'