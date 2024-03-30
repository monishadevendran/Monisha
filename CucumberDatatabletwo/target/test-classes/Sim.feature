Feature:To validate the account creation in facebook application

Scenario:To create new account 
Given To Launch the browsser and maximize the window
When To launch url of facebook application
And To click create new Account button
#one dimentional Map (With headers)
And To pass the firstname in firstname text box
#key         value
|firstname1| samuel|
|firstname2| janani|
|firstname3| sangeetha|
|firstname4| peneal|

And To pass the surname in surname text box
#two dimentional Map
And To pass the mobno or email in email text box
|password1|password2|password3|
|985668866|fdfvfserr|5732332988|
|636398800|jhhhdbjcd|7393923000|
|744499091|hjjskjdhj|7732976474|

And To create new password using new password text box
Then To close the browser