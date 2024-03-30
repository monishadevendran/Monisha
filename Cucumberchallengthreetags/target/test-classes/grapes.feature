@Feature1
Feature:To validate the login functionality of myntra application

@Regression
Scenario:To validate login with valid phonenum
Given To Launch Edge browser and maximize windows
When To Launch Url browser of the myntra application
And To pass valid usernumber in phone number field
And To click the continue button 
And To check whether navigate to the home or not
Then to close browser

@smoke
Scenario Outline: To validate the positive and negative combination of login functionality 
Given user has to launch the browser and maximize the window 
When user has to hit the myntra url 
And user has to pass the  valid usernum"<mobilenumber>" in phone number field
And user has to click the continue button
Then user has to close the browser 

Examples:
    |mobilenumber |
    |9773726489   |
    |9847475788   |
    |7708237747   |