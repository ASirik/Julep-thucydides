Meta:
@tag capability:Maven

Scenario: (MV01) As a guest I can select Maven Gift: One, Three or Six Month Subscription
Given I am on Gift Of Maven Page as guest
When I Choose '2 boxes' Gift Subscription
Then I See '2 boxes' Gift Subscription is selected
When I Choose '4 boxes' Gift Subscription
Then I See '4 boxes' Gift Subscription is selected
When I Choose '6 boxes' Gift Subscription
Then I See '6 boxes' Gift Subscription is selected

Scenario: (MV02) As a guest I can purchase Maven Gift: One Month Subscription
Given I am on Gift Of Maven Page as guest
When: I add '2 boxes' Gift Subscription to cart
And I Order cart
Then I see Order is placed

Scenario: (MV03) As a guest I can purchase Maven Gift: Three Month Subscription
Given I am on Gift Of Maven Page as guest
When: I add '4 boxes' Gift Subscription to cart
And I Order cart
Then I see Order is placed

Scenario: (MV04) As a guest I can purchase Maven Gift: Six Month Subscription
Given I am on Gift Of Maven Page as guest
When: I add '6 boxes' Gift Subscription to cart
And I Order cart
Then I see Order is placed



Scenario: Looking up the definition of 'apple'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'apple'
Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.'

Scenario: Looking up the definition of 'pear'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'pear'
Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
