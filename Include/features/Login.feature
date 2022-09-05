Feature: Login Feature
Scenario Outline: Test clock in

Given User navigate to login page
When User enter <username> and <password>
And Click on login button
Then User is navigated to homepage
When User Clock In
Then User has working

Examples:
|	username	|	password			|
|	admin			|	@dminKAI123		|
#|	jamet			|	kudasi		|