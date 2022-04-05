Feature: Search and matchs the Products name
@TopDeals
Scenario Outline: Search Experience for product search in both home and top deals page

Given User is on GreenCart Landing page
When user searched with Shortname <Shortname> and extracted actual name of product
Then user searched for <Shortname> shortname in top deals page
And  validate product name in top deals page matches with Landing Page

Examples:
| Shortname  |
| Tom        |
| Beet       |
#| Bea        |
#| Bri        |
#| Pum        |