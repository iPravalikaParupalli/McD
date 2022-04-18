Feature: feature to test cart functionality



Scenario Outline: Opening the cart
Given Open the browser "https://www.mcdelivery.co.in/"
And user is on Login page
When user enters '<mobilenumber>' and '<password>'
And user click on login button
Then user is navigating to the home page

Given user selects item
When user clicks on add to cart button 

Given user clicks on view cart 
Then User should see the burger in cart
And user click on recommendations
Then click on promocode
Then click on ApplyButton
Then click on OkButton
Then user can set delivery instructions
Then click on pay


Examples:
| mobilenumber | password |DeliveryInstructions|
| "9346321748" | "Pravalika@18" |	"Provide extra chili flakes sachets"	|