Feature: Purchase product


  Scenario Outline: Successful product purchase
    Given The user goes to the <url>
    And   I check that the home page is opened
    And   I choose Accept Cookies from the cookie preferences
    And   I login with "<email>" and "<password>"
    And   I check that successfully login
    And  The user navigates to the "<Listname>" category and clicks on the "<Product>" subcategory.
    And  The user selects the Price Ascending sort option and refreshes the page.
    And  The user selects the "<firstproduct>" from the list and goes to the product page.
    And  User clicks add to cart button and goes to cart page.
    And  The user changes the quantity of the product to 2 on the cart page.
    And  The user clicks the "Continue" button and goes to the payment page.
    Then  The user checks for the existence of the make payment button.


    Examples:
      | url                    | email                      | password     | Listname   | Product | firstproduct |
      | "https://www.n11.com/" | burakerdemiroglu@gmail.com | 66932011onur | Elektronik | Telefon | 1            |