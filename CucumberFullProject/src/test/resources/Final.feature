@feature1
Feature:To validate the login functionality of myntra application

@Regression
Scenario:To validate login with valid user id and valid password
Given To Launch Edge browser and maximize windows
When To Launch Url browser of the ICICI bank application
And To move to the login button
And To clickthe personal 
And To pass valid useridin in number field  
And To click the login
And To check whether navigate to the home or not
Then to close browser

@smoke
Scenario Outline: To validate the positive and negative combination of login functionality 
Given user has to launch the browser and maximize the window 
When user has to hit the icici bank url 
And user has to move to the login button
And user has to click the personal 
And user has to pass valid userid"<userid>" in number field
And user has to click the login 
Then user has to close the browser 

Examples:
    |userid   |
    |bhavin   |
   