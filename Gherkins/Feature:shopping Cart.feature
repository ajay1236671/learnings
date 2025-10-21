Feature: Shopping Cart
  Rule: Users can add items to the shopping cart
    Scenario: Add a single item to the cart
      Given a user is on the product page
      When the user clicks "Add to Cart" on a product
      Then the product should be added to the cart
      And the cart should show 1 item
    Scenario: Add multiple items to the cart
      Given a user has added 1 item to the cart
      When the user adds 2 more items of the same product
      Then the cart should show 3 items of that product