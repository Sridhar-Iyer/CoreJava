Feature: A story is a collection of scenerios

Scenario: Open gmail in chrome webbrowser
Given the user opens gmail
When the user enters username your_username
And the user clicks Next button
And the user enters password your_password
And the user clicks sigin button
Then gmail should be displayed for user your_name