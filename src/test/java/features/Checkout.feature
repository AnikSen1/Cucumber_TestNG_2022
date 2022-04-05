Feature: Place the order for Products

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and top deals page

Given User is on GreenCart Landing page
When user searched with Shortname <Shortname> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <Shortname> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Shortname  |
| Tom 	     |

