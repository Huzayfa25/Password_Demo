
Feature: Create Password 

@H

Scenario: Verify user can Generate 3 Default Password

Given Launch  "<URL>"
When Click on the Default button
And Click on Generate 3 Passwords button
Then Verify Password is displayed


@M

Scenario: Generate a password in a number of words 2, minimum length 4, maximum length 5, UpperCase letter and a Special Character. 


Given Launch  "<URL>"
When Expand the WORDS Button
And Select Number of Words 
Then Select Minimum Length
Then Select Maximum Length
Then Expand the TRANSFORMATIONS Button
Then Select Case Transformation
Then Expand the SEPARATOR Button
Then Select Specified Character 
And type @ in the character
Then Click on Passwords Generate button


