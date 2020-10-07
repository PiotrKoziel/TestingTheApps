@log

Feature: log in to application
  This file runs log in procedure to application.
  This particular session is for description pupose and dos not
  affect test performance.

  Background:
    Given   user is on the login page

  Scenario Outline: user log is by using correct data

    And     user with username <username> and password <password> is listed in database
    When    user enters username <username> and password <password>
    And     user clicks login button
    Then    user logs in to home page
    And     user sees successful log in message

    Examples:
    | username  |   password   |
    | username1 |   password1  |
    | username2 |   password2  |

  Scenario: user types in incorrect password
    And     user with username username2 and password password is listed in database
    When    user enters username username2 and password wrongPassword
    And     user clicks login button
    But     log in data is incorrect
    Then    user is not forwarded to home page
    And     user sees unsuccessful log in message

