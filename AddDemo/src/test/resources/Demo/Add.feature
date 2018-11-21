Feature: Addition of numbers
Create a new account with valid csutomer and sufficient balance
Scenario Outline: Add numbers with valid input details
Given User creates object of calculator
When user pass <number1> and <number2> as input also <result> as expected
Then Display sum of two numbers
Examples:
|number1||number2||result|
|23||45||68|