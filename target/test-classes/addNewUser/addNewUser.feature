@dev
Feature: adding new user

  Scenario Outline: adding new user with correct data

    Given user is on register form page
    When  user enters correct data into form
    | name    |  <name>     |
    | surname |  <surname>  |
    | city    |  <city>     |
    | street  |  <street>   |

    Then  information is displayed that new user is added

    Examples:
    | name  | surname   | city      | street |
    | Jan   | Kowalski  | Katowice  | Polna  |
    | Piotr | Nowak     | Kalisz    | Nowa   |