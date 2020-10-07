@atm

Feature:  Withdraw money from a cash machine
  Scenario: Withdrawing more money than actually is located on bank account

    Given Account balance of 200 eur
    When  User tries to withdraw 300 eur
    Then  Account balance remains the same and equals 200 eur
