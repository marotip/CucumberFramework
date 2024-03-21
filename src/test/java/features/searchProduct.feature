Feature: Search and Place the order for Products
@OffersPage
Scenario Outline: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When  User searched with Shortname <Name> and extracted actual name of product
Then  User searched for <Name> shortname in offers page
And validate product name in offers page matches with Landing page

Examples:
| Name |
| Tom  |
| Beet |